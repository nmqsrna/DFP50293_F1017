package com.example.dfp50293_f1017;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    public final static String USERNAME ="com.example.dfp50293_f1017.username";

    TextView tv_Username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tv_Username = findViewById(R.id.tvUsername);

        Intent intent = getIntent();

        String username = intent.getStringExtra(USERNAME);

        tv_Username.setTextSize(30);
        tv_Username.setText(username);

    }
}