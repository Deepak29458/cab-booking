package com.tranxit.keodriver.ui.activity.regsiter;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.MyOTP;
import com.tranxit.keodriver.data.network.model.ServicesModel;
import com.tranxit.keodriver.data.network.model.SettingsResponse;
import com.tranxit.keodriver.data.network.model.User;

import java.util.List;

public interface RegisterIView extends MvpView {
    void onSuccess(User user);

    void onSuccess(MyOTP otp);

    void onError(Throwable e);

    void onSuccess(SettingsResponse response);

    void onSuccess(List<ServicesModel> response);
}
