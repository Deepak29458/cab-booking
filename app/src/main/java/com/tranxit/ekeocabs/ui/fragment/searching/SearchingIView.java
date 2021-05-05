package com.tranxit.ekeocabs.ui.fragment.searching;

import com.tranxit.ekeocabs.base.MvpView;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface SearchingIView extends MvpView{
    void onSuccess(Object object);
    void onError(Throwable e);
}
