package com.tranxit.keodriver.ui.activity.upcoming_detail;


import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.HistoryDetail;

public interface UpcomingTripDetailIView extends MvpView {
    void onSuccess(HistoryDetail historyDetail);

    void onError(Throwable e);
}
