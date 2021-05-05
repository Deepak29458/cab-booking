package com.tranxit.keodriver.base;

import android.app.Activity;

import com.tranxit.keodriver.MvpApplication;

public interface MvpPresenter<V extends MvpView> {

    Activity activity();

    MvpApplication appContext();

    void attachView(V mvpView);

    void detachView();

}
