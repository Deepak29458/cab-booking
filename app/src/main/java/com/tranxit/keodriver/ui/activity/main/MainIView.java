package com.tranxit.keodriver.ui.activity.main;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.OTPResponse;
import com.tranxit.keodriver.data.network.model.SettingsResponse;
import com.tranxit.keodriver.data.network.model.TripResponse;
import com.tranxit.keodriver.data.network.model.User;

public interface MainIView extends MvpView {
    void onSuccess(User user);
    void onSuccessLogout(Object object);
    void onSuccess(TripResponse tripResponse);
    void onSuccessProviderAvailable(Object object);
    void onSuccessFCM(Object object);
    void onSuccessLocationUpdate(TripResponse tripResponse);

    void onSuccessServerLocationUpdate(Object object);
    void onSuccessInstant(OTPResponse object);

    void onSuccessInstantNow(Object object);
    void onSuccess(SettingsResponse response);

}
