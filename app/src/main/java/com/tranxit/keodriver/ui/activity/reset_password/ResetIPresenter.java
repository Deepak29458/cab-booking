package com.tranxit.keodriver.ui.activity.reset_password;

import com.tranxit.keodriver.base.MvpPresenter;

import java.util.HashMap;

public interface ResetIPresenter<V extends ResetIView> extends MvpPresenter<V> {
    void reset(HashMap<String, Object> obj);
}
