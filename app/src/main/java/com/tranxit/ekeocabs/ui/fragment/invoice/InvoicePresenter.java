package com.tranxit.ekeocabs.ui.fragment.invoice;

import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;
import com.tranxit.ekeocabs.data.network.model.Message;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class InvoicePresenter<V extends InvoiceIView> extends BasePresenter<V> implements InvoiceIPresenter<V> {

    @Override
    public void payment(Integer requestId) {
        Observable modelObservable = APIClient.getAPIClient().payment(requestId);
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((Message) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
