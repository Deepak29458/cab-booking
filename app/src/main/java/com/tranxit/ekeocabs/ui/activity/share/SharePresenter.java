package com.tranxit.ekeocabs.ui.activity.share;

import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;
import com.tranxit.ekeocabs.data.network.model.AddressResponse;
import com.tranxit.ekeocabs.data.network.model.User;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class SharePresenter<V extends ShareIView> extends BasePresenter<V> implements ShareIPresenter<V> {


    @Override
    public void profile() {
        Observable modelObservable = APIClient.getAPIClient().profile();

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((User) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
