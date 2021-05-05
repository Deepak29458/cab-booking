package com.tranxit.keodriver.ui.activity.email;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.User;

public interface EmailIView extends MvpView {
    void onSuccess(User token);

    void onError(Throwable e);
}
