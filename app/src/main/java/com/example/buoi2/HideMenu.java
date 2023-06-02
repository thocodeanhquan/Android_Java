package com.example.buoi2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HideMenu extends AppCompatActivity {

    ImageButton img_btn_goto;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_menu);

        img_btn_goto = findViewById(R.id.img_btn_goto);
        img_btn_goto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HideMenu.this, GhiChuApp.class);
                startActivity(intent);
            }
        });

    }
}