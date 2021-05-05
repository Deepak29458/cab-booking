package com.tranxit.keodriver.ui.bottomsheetdialog.cancel;

import com.tranxit.keodriver.base.MvpPresenter;

import java.util.HashMap;

public interface CancelDialogIPresenter<V extends CancelDialogIView> extends MvpPresenter<V> {

    void cancelRequest(HashMap<String, Object> obj);
}
