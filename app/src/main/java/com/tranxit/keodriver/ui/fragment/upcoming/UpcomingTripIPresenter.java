package com.tranxit.keodriver.ui.fragment.upcoming;


import com.tranxit.keodriver.base.MvpPresenter;

public interface UpcomingTripIPresenter<V extends UpcomingTripIView> extends MvpPresenter<V> {
    void getUpcoming();
}
