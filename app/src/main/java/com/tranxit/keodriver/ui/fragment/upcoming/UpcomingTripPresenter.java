package com.tranxit.keodriver.ui.fragment.upcoming;


import com.tranxit.keodriver.base.BasePresenter;
import com.tranxit.keodriver.data.network.APIClient;
import com.tranxit.keodriver.data.network.model.HistoryList;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class UpcomingTripPresenter<V extends UpcomingTripIView> extends BasePresenter<V> implements UpcomingTripIPresenter<V> {

    @Override
    public void getUpcoming() {
        Observable modelObservable = APIClient.getAPIClient().getUpcoming();
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((List<HistoryList>) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));

    }
}
