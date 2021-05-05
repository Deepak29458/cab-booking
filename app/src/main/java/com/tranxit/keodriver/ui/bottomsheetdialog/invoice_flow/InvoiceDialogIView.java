package com.tranxit.keodriver.ui.bottomsheetdialog.invoice_flow;

import com.tranxit.keodriver.base.MvpView;

public interface InvoiceDialogIView extends MvpView {
    void onSuccess(Object object);
    void onError(Throwable e);
}
