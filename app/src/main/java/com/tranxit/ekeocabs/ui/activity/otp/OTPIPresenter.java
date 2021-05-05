package com.tranxit.ekeocabs.ui.activity.otp;

import com.tranxit.ekeocabs.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface OTPIPresenter<V extends OTPIView> extends MvpPresenter<V>{
    void sendOTP(Object obj);
    void sendVoiceOTP(Object obj);
}
