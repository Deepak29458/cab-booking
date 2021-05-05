package com.tranxit.ekeocabs.ui.fragment.wallet_history;


import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;
import com.tranxit.ekeocabs.data.network.model.Wallet;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class WalletHistoryPresenter<V extends WalletHistoryIView> extends BasePresenter<V> implements WalletHistoryIPresenter<V> {


    @Override
    public void wallet() {
        Observable modelObservable = APIClient.getAPIClient().wallet();

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((List<Wallet>) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
