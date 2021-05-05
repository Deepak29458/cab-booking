package com.tranxit.ekeocabs.ui.activity.social;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.Token;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface SocialIView extends MvpView{
    void onSuccess(Token token);
    void onError(Throwable e);
}
