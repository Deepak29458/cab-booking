package com.tranxit.keodriver.ui.activity.document;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.ui.adapter.DocumentAdapter;

public interface DocumentIView extends MvpView {
    void onSuccess(DocumentAdapter adapter);
}
