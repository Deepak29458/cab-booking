package com.tranxit.keodriver.ui.activity.change_password;

import com.tranxit.keodriver.base.MvpPresenter;

import java.util.HashMap;

public interface ChangePasswordIPresenter<V extends ChangePasswordIView> extends MvpPresenter<V> {
    void changePassword(HashMap<String, Object> obj);
}
