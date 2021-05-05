package com.tranxit.keodriver.ui.bottomsheetdialog.cancel;

import com.tranxit.keodriver.base.MvpView;

public interface CancelDialogIView extends MvpView {

    void onSuccessCancel(Object object);
    void onError(Throwable e);
}
