package com.tranxit.ekeocabs.ui.activity.otp;

import com.tranxit.ekeocabs.base.BasePresenter;
import com.tranxit.ekeocabs.data.network.APIClient;
import com.tranxit.ekeocabs.data.network.model.MyOTP;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by santhosh@appoets.com on 02-05-2018.
 */
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
