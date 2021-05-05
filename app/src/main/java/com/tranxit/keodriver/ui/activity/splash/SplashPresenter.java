package com.tranxit.keodriver.ui.activity.splash;

import android.os.Handler;

import com.tranxit.keodriver.base.BasePresenter;

public class SplashPresenter<V extends SplashIView> extends BasePresenter<V> implements SplashIPresenter<V> {

    @Override
    public void handlerCall() {
        new Handler().postDelayed(() -> getMvpView().redirectHome(), 5000); //Timer is in ms here.
    }
}
