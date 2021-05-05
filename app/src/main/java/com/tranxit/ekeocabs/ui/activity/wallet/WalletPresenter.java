package com.tranxit.ekeocabs.ui.activity.wallet;

import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;
import com.tranxit.ekeocabs.data.network.model.User;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class WalletPresenter<V extends WalletIView> extends BasePresenter<V> implements WalletIPresenter<V> {

    @Override
    public void profile() {

        Observable modelObservable = APIClient.getAPIClient().profile();

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((User) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
