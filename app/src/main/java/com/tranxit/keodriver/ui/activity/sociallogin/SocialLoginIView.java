package com.tranxit.keodriver.ui.activity.sociallogin;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.Token;

public interface SocialLoginIView extends MvpView {
    void onSuccess(Token token);

    void onError(Throwable e);
}
