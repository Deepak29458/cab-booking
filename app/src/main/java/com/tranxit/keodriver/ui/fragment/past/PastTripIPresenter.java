package com.tranxit.keodriver.ui.fragment.past;


import com.tranxit.keodriver.base.MvpPresenter;

public interface PastTripIPresenter<V extends PastTripIView> extends MvpPresenter<V> {
    void getHistory();
}
