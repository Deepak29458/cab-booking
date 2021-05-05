package com.tranxit.ekeocabs.ui.fragment.book_ride;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.tranxit.ekeocabs.ui.activity.outstation.OutstationBookingActivity;
import com.tranxit.ekeocabs.user.R;
import com.tranxit.ekeocabs.base.BaseFragment;
import com.tranxit.ekeocabs.data.SharedHelper;
import com.tranxit.ekeocabs.data.network.model.EstimateFare;
import com.tranxit.ekeocabs.data.network.model.Service;
import com.tranxit.ekeocabs.data.network.model.TimePackage;
import com.tranxit.ekeocabs.ui.activity.main.MainActivity;
import com.tranxit.ekeocabs.ui.fragment.schedule.ScheduleFragment;

import org.json.JSONObject;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import retrofit2.HttpException;
import retrofit2.Response;

import static com.tranxit.ekeocabs.base.BaseActivity.RIDE_REQUEST;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookRideFragment extends BaseFragment implements BookRideIView {

    Unbinder unbinder;
    @BindView(R.id.schedule_ride)
    Button scheduleRide;
    @BindView(R.id.ride_now)
    Button rideNow;

    Service service;
    EstimateFare EstimateFare;

    @BindView(R.id.estimated_fare)
    TextView estimatedFare;
    @BindView(R.id.surge_value)
    TextView surgeValue;
    @BindView(R.id.eta)
    TextView eta;
    @BindView(R.id.model)
    TextView model;
    @BindView(R.id.use_wallet)
    CheckBox useWallet;

    @BindView(R.id.lnrWallet)
    LinearLayout lnrWallet;

    NumberFormat numberFormat = getNumberFormat();
    @BindView(R.id.lbl_non_geo_price)
    TextView lblNonGeoPrice;
    @BindView(R.id.lnrNonGeoPrice)
    LinearLayout lnrNonGeoPrice;
    @BindView(R.id.lbl_min_fare)
    TextView lblMinFare;

    private BookRidePresenter<BookRideFragment> presenter = new BookRidePresenter<>();

    public BookRideFragment() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_book_ride;
    }

    @Override
    public View initView(View view) {
        unbinder = ButterKnife.bind(this, view);
        presenter.attachView(this);

        Bundle args = getArguments();
        if (args != null) {
            service = (Service) args.getSerializable("service");
            EstimateFare = (EstimateFare) args.getSerializable("estimate_fare");
            if (service != null && EstimateFare != null) {
                estimatedFare.setText(numberFormat.format(EstimateFare.getEstimatedFare()));
                surgeValue.setText(EstimateFare.getSurgeValue());
                eta.setText(EstimateFare.getTime());
                model.setText(service.getName());
                RIDE_REQUEST.put("distance", EstimateFare.getDistance());

                lnrNonGeoPrice.setVisibility(EstimateFare.getNon_geo_price() > 0 ? View.VISIBLE : View.GONE);
                lblNonGeoPrice.setText(numberFormat.format(EstimateFare.getNon_geo_price()));
            }
        }


        if (SharedHelper.getIntKey(activity(), "wallet_amount") > 0) {
            lnrWallet.setVisibility(View.VISIBLE);
        } else {
            lnrWallet.setVisibility(View.GONE);
        }

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @OnClick({R.id.schedule_ride, R.id.ride_now, R.id.peek_hour_charges})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.schedule_ride:
                ((MainActivity) activity()).changeFragment(new ScheduleFragment());
                break;
            case R.id.ride_now:
                sendRequest();
                break;
            case R.id.peek_hour_charges:
                showPeekCharges();
                break;
        }
    }

    private void showPeekCharges() {


        if (EstimateFare == null) {
            return;
        }

        List<TimePackage> list = EstimateFare.getTimePackage();
        if (!list.isEmpty()) {
            final CharSequence[] items = new CharSequence[list.size()];
            int i = 0;
            for (TimePackage timePackage : list) {
                items[i] = timePackage.getTimes().getFromTime() + " - " + timePackage.getTimes().getToTime() + " : " + numberFormat.format(timePackage.getPeakPrice()) +" / Min";
                i++;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(activity());
            builder.setTitle(getString(R.string.peek_hour_charges));
            builder.setItems(items, (dialog, item) -> {
                dialog.dismiss();
            });
            AlertDialog alert = builder.create();

            alert.show();
        }
    }

    private void sendRequest() {
        HashMap<String, Object> map = new HashMap<>(RIDE_REQUEST);
        map.put("use_wallet", useWallet.isChecked() ? 1 : 0);
        map.put("service_required", "normal");
        presenter.rideNow(map);
    }

    @Override
    public void onSuccess(@NonNull Object object) {
        Intent intent = new Intent("INTENT_FILTER");
        activity().sendBroadcast(intent);

    }

    @Override
    public void onError(Throwable e) {
        if (e instanceof HttpException) {
            Response response = ((HttpException) e).response();

            try {
                JSONObject jObjError = new JSONObject(response.errorBody().string());
                if (jObjError.has("message"))
                    Toast.makeText(getContext(), jObjError.optString("message"), Toast.LENGTH_SHORT).show();
                if (jObjError.has("error")) {
                  //  if(jObjError.optString("error").equalsIgnoreCase("Service is not available at this location.")){
                   // Toast.makeText(getContext(), ""+(jObjError.optString("error").equalsIgnoreCase("Destination out of city limits")), Toast.LENGTH_SHORT).show();
                    if(jObjError.optString("error").equalsIgnoreCase("Destination out of city limits")){


                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                        builder.setTitle("Destination is out of city").setMessage("Do you want to switch booking to outstation?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                                ((MainActivity) activity()).changeFlow("EMPTY");
                                startActivity(new Intent(getContext(), OutstationBookingActivity.class));
                            }
                        })
                                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        //  Action for 'NO' Button

                                    }
                                });

                        AlertDialog alert = builder.create();
                        //Setting the title manually
                        alert.setTitle("Destination is out of city");
                        alert.show();

                        //Toast.makeText(getContext(), "Destination is out of city. Switching to Outstation", Toast.LENGTH_SHORT).show();

                    }else {
                        Toast.makeText(getContext(), jObjError.optString("error"), Toast.LENGTH_SHORT).show();
                    }
                }
                else
                    Toast.makeText(getContext(), jObjError.toString(), Toast.LENGTH_SHORT).show();
            } catch (Exception exp) {
                Log.e("Error", exp.getMessage());
            }
        }
    }

}
