package com.tranxit.ekeocabs.ui.activity.forgot_password;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.tranxit.ekeocabs.user.R;
import com.tranxit.ekeocabs.base.BaseActivity;
import com.tranxit.ekeocabs.ui.activity.login.EmailActivity;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ForgotPasswordActivity extends BaseActivity implements ForgotPasswordIView {

    @BindView(R.id.otp)
    EditText otp;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.password_confirmation)
    EditText passwordConfirmation;
    @BindView(R.id.submit)
    Button submit;
    String OTP;
    Integer Id;

    private ForgotPasswordPresenter<ForgotPasswordActivity> presenter = new ForgotPasswordPresenter<>();

    @Override
    public int getLayoutId() {
        return R.layout.activity_forgot_password;
    }

    @Override
    public void initView() {
        ButterKnife.bind(this);
        presenter.attachView(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String email = extras.getString("email");
            Id = extras.getInt("id");
            OTP = extras.getString("otp");

        }
    }

    @OnClick(R.id.submit)
    public void onViewClicked() {

        if (otp.getText().toString().isEmpty()) {
            Toast.makeText(this, getString(R.string.invalid_otp), Toast.LENGTH_SHORT).show();
            return;
        }

        if (!otp.getText().toString().equals(OTP)) {
            Toast.makeText(this, getString(R.string.wrong_otp), Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.getText().toString().isEmpty()) {
            Toast.makeText(this, getString(R.string.invalid_password), Toast.LENGTH_SHORT).show();
            return;
        }
        if (password.getText().toString().length() < 6) {
            Toast.makeText(this, getString(R.string.invalid_password_length), Toast.LENGTH_SHORT).show();
            return;
        }
        if (!password.getText().toString().equals(passwordConfirmation.getText().toString())) {
            Toast.makeText(this, getString(R.string.password_should_be_same), Toast.LENGTH_SHORT).show();
            return;
        }

        HashMap<String, Object> map = new HashMap<>();
        map.put("password", password.getText().toString());
        map.put("password_confirmation", passwordConfirmation.getText().toString());
        map.put("id", Id);
        showLoading();
        presenter.resetPassword(map);

    }

    @Override
    public void onSuccess(Object object) {
        hideLoading();
        Toast.makeText(this, getString(R.string.password_changed_successfully), Toast.LENGTH_SHORT).show();
        finishAffinity();
        startActivity(new Intent(this, EmailActivity.class));
    }

    @Override
    public void onError(Throwable e) {
        hideLoading();
    }
}

