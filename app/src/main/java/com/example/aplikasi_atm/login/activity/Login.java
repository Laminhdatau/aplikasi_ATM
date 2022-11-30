package com.example.aplikasi_atm.login.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aplikasi_atm.R;
import com.example.aplikasi_atm.home.activity.Home;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    private TextInputLayout username,password;
    private Button login;
    String user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.textusername);
        password = findViewById(R.id.textpassword);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               user = username.getEditText().toString().trim();
                pass = password.getEditText().toString().trim();
                if (username.equals("")) {
                    username.setError("Username Anda Harus Di Isi");

                } else if (password.equals("")) {

                    password.setError("Password Harus Di Isi");
                } else {
                    Intent login = new Intent(getApplicationContext(), Home.class);
                    startActivity(login);
                }

            }
        });
    }
}

