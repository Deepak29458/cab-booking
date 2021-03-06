package com.tranxit.ekeocabs.ui.fragment.coupon_history;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.Coupon;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface CouponHistoryIView extends MvpView {
    void onSuccess(List<Coupon> couponList);
    void onError(Throwable e);
}
