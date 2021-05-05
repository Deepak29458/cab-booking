package com.tranxit.keodriver.ui.activity.splash;

import com.tranxit.keodriver.base.MvpPresenter;

public interface SplashIPresenter<V extends SplashIView> extends MvpPresenter<V> {
    void handlerCall();
}
