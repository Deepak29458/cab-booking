package com.tranxit.keodriver.ui.fragment.upcoming;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.HistoryList;

import java.util.List;

public interface UpcomingTripIView extends MvpView {
    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
