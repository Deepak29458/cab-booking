package com.tranxit.ekeocabs.ui.activity.card;

import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;
import com.tranxit.ekeocabs.data.network.model.Card;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class CardsPresenter<V extends CardsIView> extends BasePresenter<V> implements CarsIPresenter<V> {


    @Override
    public void card() {
        Observable modelObservable = APIClient.getAPIClient().card();

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((List<Card>) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
