package com.example.aplikasi_atm.menu.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasi_atm.R;
import com.example.aplikasi_atm.home.activity.Home;

public class Menu extends AppCompatActivity {

    private ImageView home,shop,info,record;
    private CardView buku_tulis;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        home = findViewById(R.id.M_home);
        buku_tulis = findViewById(R.id.buku_tulis);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Home.class);
                startActivity(a);
            }
        });
    }
}