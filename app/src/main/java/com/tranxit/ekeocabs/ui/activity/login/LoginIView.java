package com.tranxit.ekeocabs.ui.activity.login;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.ForgotResponse;
import com.tranxit.ekeocabs.data.network.model.Token;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface LoginIView extends MvpView{
    void onSuccess(Token token);
    void onSuccess(ForgotResponse object);
    void onError(Throwable e);
}
