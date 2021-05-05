package com.tranxit.keodriver.ui.bottomsheetdialog.rating;

import com.tranxit.keodriver.base.MvpPresenter;

import java.util.HashMap;

public interface RatingDialogIPresenter<V extends RatingDialogIView> extends MvpPresenter<V> {
    void rate(HashMap<String, Object> obj, Integer id);
}
