package com.tranxit.keodriver.ui.fragment.incoming_request;

import com.tranxit.keodriver.base.MvpPresenter;

public interface IncomingRequestIPresenter<V extends IncomingRequestIView> extends MvpPresenter<V> {
    void accept(Integer id, Object arrivalTime);
    void cancel(Integer id);
}
