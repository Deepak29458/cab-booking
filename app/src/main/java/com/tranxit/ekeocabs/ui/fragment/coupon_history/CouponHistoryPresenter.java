package com.tranxit.ekeocabs.ui.fragment.coupon_history;


import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;
import com.tranxit.ekeocabs.data.network.model.Coupon;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class CouponHistoryPresenter<V extends CouponHistoryIView> extends BasePresenter<V> implements CouponHistoryIPresenter<V> {


    @Override
    public void coupon() {
        Observable modelObservable = APIClient.getAPIClient().coupon();

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((List<Coupon>) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
