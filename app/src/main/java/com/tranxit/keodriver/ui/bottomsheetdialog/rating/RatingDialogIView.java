package com.tranxit.keodriver.ui.bottomsheetdialog.rating;

import com.tranxit.keodriver.base.MvpView;
import com.tranxit.keodriver.data.network.model.Rating;

public interface RatingDialogIView extends MvpView {
    void onSuccess(Rating rating);
    void onError(Throwable e);
}
