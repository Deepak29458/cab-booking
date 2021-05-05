package com.tranxit.ekeocabs.ui.fragment.cancel_ride;

import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.http.FieldMap;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class CancelRidePresenter<V extends CancelRideIView> extends BasePresenter<V> implements CancelRideIPresenter<V> {

    @Override
    public void cancelRequest(@FieldMap HashMap<String, Object> params) {
        Observable modelObservable = APIClient.getAPIClient().cancelRequest(params);
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((Object) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
