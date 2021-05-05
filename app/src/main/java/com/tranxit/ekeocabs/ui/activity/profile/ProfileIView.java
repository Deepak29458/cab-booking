package com.tranxit.ekeocabs.ui.activity.profile;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.User;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface ProfileIView extends MvpView{
    void onSuccess(User user);
    void onError(Throwable e);
}
