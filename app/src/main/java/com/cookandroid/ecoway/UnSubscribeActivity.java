package com.cookandroid.ecoway;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UnSubscribeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar(); // 액션바 없애기
        actionBar.hide(); // 액션바 없애기

        super.onCreate(savedInstanceState);
        setContentView(R.layout.unsubscribe);

        Button unSubscribeButton = findViewById(R.id.yes_btn);
        unSubscribeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnSubscribeActivity.this, UnSubscribeYesActivity.class);
                startActivity(intent);
            }
        });

        Button backButton = findViewById(R.id.back_btn);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UnSubscribeActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
