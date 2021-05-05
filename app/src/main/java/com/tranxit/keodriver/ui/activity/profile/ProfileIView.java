package com.tranxit.keodriver.ui.activity.profile;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.User;

public interface ProfileIView extends MvpView {
    void onSuccess(User user);
    void onSuccessUser(User user);
    void onError(Throwable e);
}
