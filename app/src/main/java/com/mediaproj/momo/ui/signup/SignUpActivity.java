package com.mediaproj.momo.ui.signup;

import android.os.Bundle;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.mediaproj.momo.R;
import com.mediaproj.momo.data.Genre;
import com.mediaproj.momo.data.Preference;
import com.mediaproj.momo.data.Section;
import com.mediaproj.momo.data.User;
import com.mediaproj.momo.global.Retrofit.RetrofitClient;

import java.util.Arrays;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SignUpActivity extends AppCompatActivity {

    static int SELECTION_NUM = 16;

    User user;

    FrameLayout flProfile;
    EditText etEmail;
    EditText etPassword;
    EditText etName;
    EditText etAge;
    RadioButton rbMale;
    TextView btnNext;

    FrameLayout flSelection;
    TextView btnComplete;
    boolean[] selected;
    int[] ids = {R.id.btn_movie, R.id.btn_musical, R.id.btn_show, R.id.btn_festival,
            R.id.btn_drama, R.id.btn_fantasy, R.id.btn_horror, R.id.btn_romance,
            R.id.btn_action, R.id.btn_thriller, R.id.btn_animation, R.id.btn_adventure,
            R.id.btn_mistery, R.id.btn_history, R.id.btn_sf, R.id.btn_comedy};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        init();
    }

    void init() {
        user = new User();

        flProfile = findViewById(R.id.fl_profile);
        etEmail = flProfile.findViewById(R.id.et_email);
        etPassword = flProfile.findViewById(R.id.et_password);
        etPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        etPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        etName = flProfile.findViewById(R.id.et_name);
        etAge = flProfile.findViewById(R.id.et_age);
        rbMale = flProfile.findViewById(R.id.rb_male);
        btnNext = flProfile.findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goNext();
            }
        });

        flSelection = findViewById(R.id.fl_selection);
        selected = new boolean[SELECTION_NUM];
        Arrays.fill(selected, false);
        for (int i = 0; i < SELECTION_NUM; i++) {
            final int finalI = i;
            flSelection.findViewById(ids[i]).setSelected(false);
            flSelection.findViewById(ids[i]).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    flSelection.findViewById(ids[finalI]).setSelected(!flSelection.findViewById(ids[finalI]).isSelected());
                }
            });
        }
        btnComplete = flSelection.findViewById(R.id.btn_complete);
        btnComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                complete();
            }
        });
    }

    void goNext() {
        setProfile();
        flProfile.setVisibility(View.GONE);
        flSelection.setVisibility(View.VISIBLE);
    }

    void setProfile() {
        user.setEmail(etEmail.getText().toString().trim());
        user.setPassword(etPassword.getText().toString().trim());
        user.setName(etName.getText().toString().trim());
        user.setAge(Integer.valueOf(etAge.getText().toString().trim()));
        user.setGender(rbMale.isSelected());
    }

    void complete() {
        setSelection();
        createUser();
    }

    void setSelection() {
        for (int i = 0; i < SELECTION_NUM; i++)
            selected[i] = flSelection.findViewById(ids[i]).isSelected();

        Preference preference = new Preference(new Section(selected[0], selected[1], selected[2], selected[3]),
                new Genre(selected[4], selected[5], selected[6], selected[7],
                        selected[8], selected[9], selected[10], selected[11],
                        selected[12], selected[13], selected[14], selected[15]));
        user.setPreference(preference);
    }

    void createUser() {
        Call<Void> call = RetrofitClient.getApiService().createUser(user);
        call.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                finish();
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }
}
