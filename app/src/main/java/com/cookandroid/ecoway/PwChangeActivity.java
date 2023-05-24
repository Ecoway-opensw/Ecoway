package com.cookandroid.ecoway;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PwChangeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar(); // 액션바 없애기
        actionBar.hide(); // 액션바 없애기

        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_pw);
    }
}