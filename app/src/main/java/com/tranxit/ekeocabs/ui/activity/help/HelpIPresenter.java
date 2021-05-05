package com.tranxit.ekeocabs.ui.activity.help;


import com.tranxit.ekeocabs.base.MvpPresenter;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface HelpIPresenter<V extends HelpIView> extends MvpPresenter<V> {
    void help();
}
