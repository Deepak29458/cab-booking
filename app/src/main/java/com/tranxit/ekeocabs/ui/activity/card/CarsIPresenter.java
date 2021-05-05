package com.tranxit.ekeocabs.ui.activity.card;

import com.tranxit.ekeocabs.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface CarsIPresenter<V extends CardsIView> extends MvpPresenter<V> {
    void card();
}
