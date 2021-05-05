package com.tranxit.ekeocabs.ui.activity.location_pick;

import com.tranxit.ekeocabs.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface LocationPickIPresenter<V extends LocationPickIView> extends MvpPresenter<V>{
    void address();
}
