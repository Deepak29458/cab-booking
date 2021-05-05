package com.tranxit.ekeocabs.ui.activity.otp;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.MyOTP;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface OTPIView extends MvpView{
    void onSuccess(MyOTP otp);
    void onError(Throwable e);
}
