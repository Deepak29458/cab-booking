package com.tranxit.keodriver.ui.activity.earnings;


import com.tranxit.keodriver.base.MvpPresenter;

public interface EarningsIPresenter<V extends EarningsIView> extends MvpPresenter<V> {
    void getEarnings();
}
