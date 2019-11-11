package com.mediaproj.momo.ui.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.mediaproj.momo.R;

public class SignUpActivity extends AppCompatActivity {

    FrameLayout flProfile;
    EditText etEmail;
    EditText password;
    EditText name;
    EditText age;

    FrameLayout flSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


    }
}
