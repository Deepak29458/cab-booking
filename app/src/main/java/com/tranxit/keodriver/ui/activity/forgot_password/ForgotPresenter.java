package com.tranxit.keodriver.ui.activity.forgot_password;

import com.tranxit.keodriver.base.BasePresenter;
import com.tranxit.keodriver.data.network.APIClient;
import com.tranxit.keodriver.data.network.model.ForgotResponse;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ForgotPresenter<V extends ForgotIView> extends BasePresenter<V> implements ForgotIPresenter<V> {
    @Override
    public void forgot(HashMap<String, Object> obj) {
        Observable modelObservable = APIClient.getAPIClient().forgotPassword(obj);
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((ForgotResponse) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
