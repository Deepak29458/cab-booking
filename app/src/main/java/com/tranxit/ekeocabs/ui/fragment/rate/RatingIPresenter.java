package com.tranxit.ekeocabs.ui.fragment.rate;

import com.tranxit.ekeocabs.base.MvpPresenter;

import java.util.HashMap;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface RatingIPresenter<V extends RatingIView> extends MvpPresenter<V> {
    void rate(HashMap<String, Object> obj);
}
