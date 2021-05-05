package com.tranxit.keodriver.ui.activity.help;


import com.tranxit.keodriver.base.MvpPresenter;

public interface HelpIPresenter<V extends HelpIView> extends MvpPresenter<V> {
    void getHelp();
}
