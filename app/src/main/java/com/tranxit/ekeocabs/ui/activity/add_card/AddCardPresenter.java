package com.tranxit.ekeocabs.ui.activity.add_card;

import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class AddCardPresenter<V extends AddCardIView> extends BasePresenter<V> implements AddCardIPresenter<V> {
    @Override
    public void card(String cardId) {

        Observable modelObservable = APIClient.getAPIClient().card(cardId);

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((Object) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
/*
    @Override
    public void card() {

        Observable modelObservable = APIClient.getAPIClient().profile();

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((User) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }*/
}
