package com.tranxit.keodriver.ui.fragment.status_flow;

import com.tranxit.keodriver.base.MvpView;

public interface StatusFlowIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
