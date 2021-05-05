package com.tranxit.ekeocabs.ui.activity.share;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.tranxit.ekeocabs.base.BaseActivity;
import com.tranxit.ekeocabs.common.LocaleHelper;
import com.tranxit.ekeocabs.data.network.model.Address;
import com.tranxit.ekeocabs.data.network.model.AddressResponse;
import com.tranxit.ekeocabs.data.network.model.User;
import com.tranxit.ekeocabs.ui.activity.location_pick.LocationPickActivity;
import com.tranxit.ekeocabs.ui.activity.splash.SplashActivity;
import com.tranxit.ekeocabs.user.BuildConfig;
import com.tranxit.ekeocabs.user.R;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.tranxit.ekeocabs.MvpApplication.PICK_LOCATION_REQUEST_CODE;

public class ShareActivity extends BaseActivity implements ShareIView {

//    @BindView(R.id.choose_language)
//    RadioGroup chooseLanguage;
//    @BindView(R.id.english)
//    RadioButton english;
//    @BindView(R.id.arabic)
//    RadioButton arabic;
//    @BindView(R.id.home_status)
//    TextView homeStatus;
    @BindView(R.id.referCode)
    TextView referCode;
    @BindView(R.id.shareBtn)
    ImageView shareBtn;
    @BindView(R.id.totalRefer)
    TextView totalRefer;

    String type = "home";
    private SharePresenter<ShareActivity> presenter = new SharePresenter<>();
    Address work = null;
    Address home = null;


    String currentSAddress;
    Object currentSLatitude;
    Object currentSLongitude;

    @Override
    public int getLayoutId() {
        return R.layout.activity_share;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
        presenter.attachView(this);

        presenter.profile();



    }




    public void shareApp() {
        try {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.app_name));
            i.putExtra(Intent.EXTRA_TEXT, "Hey Checkout this app, " + getString(R.string.app_name) + "\nhttps://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
            startActivity(Intent.createChooser(i, "choose one"));
        } catch (Exception e) {
            Log.e("Error", e.getMessage());
        }
    }


    @Override
    public void onSuccess(User user) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @OnClick({R.id.shareBtn})
    public void onViewClicked(View view) {
        switch (view.getId()) {

            case R.id.shareBtn:
                shareApp();
                break;
        }
    }


}
