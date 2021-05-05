package com.tranxit.keodriver.ui.activity.summary;


import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.Summary;

public interface SummaryIView extends MvpView {
    void onSuccess(Summary object);

    void onError(Throwable e);
}
