package com.tranxit.keodriver.ui.activity.location_pick;


import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.AddressResponse;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface LocationPickIView extends MvpView {

    void onSuccess(AddressResponse address);
    void onError(Throwable e);
}
