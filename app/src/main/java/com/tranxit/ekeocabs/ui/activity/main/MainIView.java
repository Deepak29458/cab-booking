package com.tranxit.ekeocabs.ui.activity.main;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.DataResponse;
import com.tranxit.ekeocabs.data.network.model.Provider;
import com.tranxit.ekeocabs.data.network.model.SettingsResponse;
import com.tranxit.ekeocabs.data.network.model.User;

import java.util.List;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface MainIView extends MvpView{
    void onSuccess(User user);
    void onSuccess(DataResponse dataResponse);
    void onSuccessLogout(Object object);
    void onSuccess(List<Provider> objects);
    void onError(Throwable e);
    void onSuccess(SettingsResponse response);
}
