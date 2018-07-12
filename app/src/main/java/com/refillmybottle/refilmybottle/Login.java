package com.refillmybottle.refilmybottle;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {

    @BindView(R.id.username)
    TextInputEditText username;
    @BindView(R.id.password)
    TextInputEditText password;
    @BindView(R.id.forgot)
    TextView forgot;
    @BindView(R.id.sigIn)
    Button sigIn;
    @BindView(R.id.signUp)
    TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.forgot, R.id.sigIn, R.id.signUp})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.forgot:
                break;
            case R.id.sigIn:
                break;
            case R.id.signUp:
                break;
        }
    }
}
