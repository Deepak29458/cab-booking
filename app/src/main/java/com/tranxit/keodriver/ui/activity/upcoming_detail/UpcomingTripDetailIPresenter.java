package com.tranxit.keodriver.ui.activity.upcoming_detail;


import com.tranxit.keodriver.base.MvpPresenter;

public interface UpcomingTripDetailIPresenter<V extends UpcomingTripDetailIView> extends MvpPresenter<V> {
    void getUpcomingDetail(Object request_id);
}
