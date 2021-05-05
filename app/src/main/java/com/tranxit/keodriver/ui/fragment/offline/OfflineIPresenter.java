package com.tranxit.keodriver.ui.fragment.offline;

import com.tranxit.keodriver.base.MvpPresenter;

import java.util.HashMap;

public interface OfflineIPresenter<V extends OfflineIView> extends MvpPresenter<V> {
    void providerAvailable(HashMap<String, Object> obj);
}
