package com.tranxit.keodriver.ui.fragment.offline;

import com.tranxit.keodriver.base.MvpView;

public interface OfflineIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
