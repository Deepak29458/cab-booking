package com.tranxit.ekeocabs.ui.fragment.past_trip;

import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;
import com.tranxit.ekeocabs.data.network.model.Datum;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class PastTripPresenter<V extends PastTripIView> extends BasePresenter<V> implements PastTripIPresenter<V> {

    @Override
    public void pastTrip() {
        Observable modelObservable = APIClient.getAPIClient().pastTrip();
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((List<Datum>) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
