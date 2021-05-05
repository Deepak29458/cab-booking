package com.tranxit.keodriver.ui.activity.earnings;


import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.EarningsList;

public interface EarningsIView extends MvpView {
    void onSuccess(EarningsList earningsLists);

    void onError(Throwable e);
}
