package com.tranxit.ekeocabs.ui.activity.forgot_password;


import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
public class ForgotPasswordPresenter<V extends ForgotPasswordIView> extends BasePresenter<V> implements ForgotPasswordIPresenter<V> {


    @Override
    public void resetPassword(HashMap<String, Object> parms) {
        Observable modelObservable = APIClient.getAPIClient().resetPassword(parms);

        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((Object) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
