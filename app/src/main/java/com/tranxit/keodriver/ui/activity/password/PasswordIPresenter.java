package com.tranxit.keodriver.ui.activity.password;

import com.tranxit.keodriver.base.MvpPresenter;

import java.util.HashMap;

public interface PasswordIPresenter<V extends PasswordIView> extends MvpPresenter<V> {
    void login(HashMap<String, Object> obj);
}
