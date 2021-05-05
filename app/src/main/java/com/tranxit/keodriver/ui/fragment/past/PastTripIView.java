package com.tranxit.keodriver.ui.fragment.past;


import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.HistoryList;

import java.util.List;

public interface PastTripIView extends MvpView {
    void onSuccess(List<HistoryList> historyList);
    void onError(Throwable e);
}
