package com.tranxit.keodriver.ui.activity.past_detail;


import com.tranxit.keodriver.base.MvpPresenter;

public interface PastTripDetailIPresenter<V extends PastTripDetailIView> extends MvpPresenter<V> {
    void getPastTripDetail(Object request_id);
}
