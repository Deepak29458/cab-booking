package com.tranxit.keodriver.ui.activity.forgot_password;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.ForgotResponse;

public interface ForgotIView extends MvpView {
    void onSuccess(ForgotResponse forgotResponse);
    void onError(Throwable e);
}
