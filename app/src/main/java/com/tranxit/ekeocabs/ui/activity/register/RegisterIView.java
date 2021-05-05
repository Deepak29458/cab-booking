package com.tranxit.ekeocabs.ui.activity.register;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.MyOTP;
import com.tranxit.ekeocabs.data.network.model.SettingsResponse;
import com.tranxit.ekeocabs.data.network.model.Token;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface RegisterIView extends MvpView{
    void onSuccess(Token token);
    void onSuccess(MyOTP otp);
    void onError(Throwable e);
    void onSuccess(SettingsResponse response);
}
