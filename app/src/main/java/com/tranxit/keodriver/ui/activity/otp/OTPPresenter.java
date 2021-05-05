package com.tranxit.keodriver.ui.activity.otp;


import com.tranxit.keodriver.base.BasePresenter;
import com.tranxit.keodriver.data.network.APIClient;
import com.tranxit.keodriver.data.network.model.MyOTP;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class OTPPresenter<V extends OTPIView> extends BasePresenter<V> implements OTPIPresenter<V> {

    @Override
    public void sendOTP(Object obj) {

        Observable modelObservable = APIClient.getAPIClient().sendOtp(obj);
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((MyOTP) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }

    @Override
    public void sendVoiceOTP(Object obj) {

        Observable modelObservable = APIClient.getAPIClient().sendVoiceOtp(obj);
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((MyOTP) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));
    }
}
