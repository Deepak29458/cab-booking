package com.tranxit.keodriver.ui.activity.otp;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.MyOTP;

public interface OTPIView extends MvpView {
    void onSuccess(MyOTP otp);

    void onError(Throwable e);
}
