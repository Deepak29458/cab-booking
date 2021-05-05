package com.tranxit.keodriver.ui.activity.summary;


import com.tranxit.keodriver.base.MvpPresenter;

public interface SummaryIPresenter<V extends SummaryIView> extends MvpPresenter<V> {
    void getSummary();
}
