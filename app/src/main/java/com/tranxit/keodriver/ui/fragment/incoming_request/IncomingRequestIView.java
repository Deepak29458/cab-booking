package com.tranxit.keodriver.ui.fragment.incoming_request;

import com.tranxit.keodriver.base.MvpView;

public interface IncomingRequestIView extends MvpView {
    void onSuccessAccept(Object responseBody);
    void onSuccessCancel(Object object);
    void onError(Throwable e);
}
