package com.tranxit.ekeocabs.ui.activity.outstation;


import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.EstimateFare;
import com.tranxit.ekeocabs.ui.adapter.ServiceAdapterSingle;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface OutstationBookingIView extends MvpView {

    void onSuccess(ServiceAdapterSingle adapter);

    void onSuccessRequest(Object object);
    void onSuccess(EstimateFare estimateFare);
}
