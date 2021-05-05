package com.tranxit.keodriver.ui.activity.help;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.Help;

public interface HelpIView extends MvpView {
    void onSuccess(Help object);

    void onError(Throwable e);
}
