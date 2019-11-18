package com.mediaproj.momo.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.mediaproj.momo.R;
import com.mediaproj.momo.data.LoginData;
import com.mediaproj.momo.data.UserData;
import com.mediaproj.momo.global.MomoUtil;
import com.mediaproj.momo.global.Retrofit.RetrofitClient;
import com.mediaproj.momo.ui.signup.SignUpActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail;
    EditText etPassword;
    TextView btnLogin;
    TextView btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        init();
    }

    void init() {
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        etPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });
        btnSignUp = findViewById(R.id.btn_signup);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signUp();
            }
        });
    }

    void login() {
        LoginData loginData = new LoginData(etEmail.getText().toString().trim(), etPassword.getText().toString().trim());

        Call<UserData> call = RetrofitClient.getApiService().login(loginData);
        call.enqueue(new Callback<UserData>() {
            @Override
            public void onResponse(Call<UserData> call, Response<UserData> response) {

                UserData userData = response.body();

                if (userData == null)
                    MomoUtil.showMessage(LoginActivity.this, getString(R.string.no_such_user));
                else if (!userData.isLogined())
                    Toast.makeText(LoginActivity.this, getString(R.string.login_failed), Toast.LENGTH_SHORT).show();
                else {
                    Toast.makeText(LoginActivity.this, String.format(getString(R.string.login_success), userData.getName()), Toast.LENGTH_SHORT).show();
                    finish();
                }
            }

            @Override
            public void onFailure(Call<UserData> call, Throwable t) {
                MomoUtil.showMessage(LoginActivity.this, getString(R.string.wrong_user_data));
            }
        });
    }

    void signUp() {
        etEmail.setText("");
        etPassword.setText("");
        Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(intent);
    }
}
