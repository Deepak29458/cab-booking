package com.tranxit.ekeocabs.ui.activity.help;

import com.tranxit.ekeocabs.base.MvpView;
import com.tranxit.ekeocabs.data.network.model.Help;

/**
 * Created by santhosh@appoets.com on 19-05-2018.
 */
public interface HelpIView extends MvpView {
    void onSuccess(Help help);
    void onError(Throwable e);
}
