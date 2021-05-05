package com.tranxit.ekeocabs.ui.activity.coupon;


import com.tranxit.ekeocabs.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface CouponIPresenter<V extends CouponIView> extends MvpPresenter<V> {
    void coupon(String promoCode);
}
