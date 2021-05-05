package com.tranxit.ekeocabs.base;

import android.app.Activity;

import com.tranxit.ekeocabs.MvpApplication;


public interface MvpPresenter<V extends MvpView> {
    Activity activity();
    MvpApplication appContext();
    void attachView(V mvpView);

    void detachView();

}
