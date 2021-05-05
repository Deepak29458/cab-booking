package com.tranxit.keodriver.ui.activity.password;

import com.tranxit.keodriver.base.BasePresenter;
import com.tranxit.keodriver.data.network.APIClient;
import com.tranxit.keodriver.data.network.model.User;

import java.util.HashMap;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class PasswordPresenter<V extends PasswordIView> extends BasePresenter<V> implements PasswordIPresenter<V> {

    @Override
    public void login(HashMap<String, Object> obj) {
        Observable modelObservable = APIClient.getAPIClient().login(obj);
        modelObservable.subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(trendsResponse -> getMvpView().onSuccess((User) trendsResponse),
                        throwable -> getMvpView().onError((Throwable) throwable));

    }
}
