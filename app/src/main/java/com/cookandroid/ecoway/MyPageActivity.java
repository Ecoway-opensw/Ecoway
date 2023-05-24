package com.cookandroid.ecoway;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar(); // 액션바 없애기
        actionBar.hide(); // 액션바 없애기

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);

        Button recycleBrandButton = findViewById(R.id.recyle_btn);
        recycleBrandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, RecycleBrandActivity.class);
                startActivity(intent);
            }
        });

        Button cambrandBtn = findViewById(R.id.campainBrand_btn);
        cambrandBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, CamBrandActivity.class);
                startActivity(intent);
            }
        });

        Button pwChangeButton = findViewById(R.id.change_pw_btn);
        pwChangeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, PwChangeActivity.class);
                startActivity(intent);
            }
        });

        Button unSubscribeButton = findViewById(R.id.unsubscribe_btn);
        unSubscribeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyPageActivity.this, UnSubscribeActivity.class);
                startActivity(intent);
            }
        });
    }
}
