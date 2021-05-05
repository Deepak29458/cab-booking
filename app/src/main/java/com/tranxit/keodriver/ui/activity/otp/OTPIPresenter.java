package com.tranxit.keodriver.ui.activity.otp;

import com.tranxit.keodriver.base.MvpPresenter;


public interface OTPIPresenter<V extends OTPIView> extends MvpPresenter<V> {
    void sendOTP(Object obj);
    void sendVoiceOTP(Object obj);
}
