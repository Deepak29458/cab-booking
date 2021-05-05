package com.tranxit.ekeocabs.ui.activity;

import android.webkit.WebView;

import com.tranxit.ekeocabs.user.BuildConfig;
import com.tranxit.ekeocabs.user.R;
import com.tranxit.ekeocabs.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PrivacyActivity extends BaseActivity {

    @BindView(R.id.web_view)
    WebView webView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_privacy;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
        webView.loadUrl(BuildConfig.BASE_URL + "privacy");

    }
}
