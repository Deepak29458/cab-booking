package com.tranxit.keodriver.ui.activity.password;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.User;

public interface PasswordIView extends MvpView {
    void onSuccess(User object);

    void onError(Throwable e);
}
