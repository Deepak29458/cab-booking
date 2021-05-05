package com.tranxit.keodriver.ui.activity.change_password;

import com.tranxit.keodriver.base.MvpView;

public interface ChangePasswordIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
