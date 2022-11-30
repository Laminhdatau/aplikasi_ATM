package com.example.aplikasi_atm.home.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasi_atm.R;
import com.example.aplikasi_atm.menu.activity.Menu;

public class Home extends AppCompatActivity {

    private CardView buku,pulpen,penghapus;
    private ImageView home,shop,info,record;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        buku = findViewById(R.id.btn_buku);
        pulpen = findViewById(R.id.btn_pulpen);
        penghapus = findViewById(R.id.btn_penghapus);
        shop = findViewById(R.id.H_shoppp);

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), Menu.class);
                startActivity(a);
            }
        });
    }
}