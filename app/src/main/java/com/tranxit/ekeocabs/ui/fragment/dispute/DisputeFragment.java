package com.tranxit.ekeocabs.ui.fragment.dispute;

import android.support.v4.app.Fragment;
import android.view.View;

import com.tranxit.ekeocabs.user.R;
import com.tranxit.ekeocabs.base.BaseBottomSheetDialogFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class DisputeFragment extends BaseBottomSheetDialogFragment implements DisputeIView {

    private DisputePresenter<DisputeFragment> presenter = new DisputePresenter<>();

    public DisputeFragment() {
        // Required empty public constructor
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_dispute;
    }

    @Override
    public void initView(View view) {
        presenter.attachView(this);

    }

    @Override
    public void onSuccess(Object object) {

    }

    @Override
    public void onError(Throwable e) {

    }
}
