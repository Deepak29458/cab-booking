package com.tranxit.ekeocabs.ui.fragment.dispute;

import com.tranxit.ekeocabs.base.MvpView;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface DisputeIView extends MvpView{
    void onSuccess(Object object);
    void onError(Throwable e);
}
