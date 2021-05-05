package com.tranxit.ekeocabs.ui.fragment.invoice;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.Message;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface InvoiceIView extends MvpView{
    void onSuccess(Message message);
    void onError(Throwable e);
}
