package com.tranxit.keodriver.ui.activity.past_detail;


import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.HistoryDetail;

public interface PastTripDetailIView extends MvpView {
    void onSuccess(HistoryDetail historyDetail);

    void onError(Throwable e);
}
