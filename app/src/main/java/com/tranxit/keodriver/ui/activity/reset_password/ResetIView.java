package com.tranxit.keodriver.ui.activity.reset_password;

import com.tranxit.keodriver.base.MvpView;

public interface ResetIView extends MvpView{
    void onSuccess(Object object);
    void onError(Throwable e);
}
