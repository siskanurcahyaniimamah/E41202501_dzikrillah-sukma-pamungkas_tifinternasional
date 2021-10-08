package com.example.appandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button calendarVw, imageVw, scrollVw, webVw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarVw = findViewById(R.id.tanggal);
        imageVw = findViewById(R.id.gambar1);
        scrollVw = findViewById(R.id.scroll);
        webVw = findViewById(R.id.web);



    }

    public void MethodGambar(View view) {
        Intent intent = new Intent(MainActivity.this, ImageActivity.class);
        startActivity(intent);
    }

    public void MethodScroll(View view) {
        Intent intent = new Intent(MainActivity.this, ScrollActivity.class);
        startActivity(intent);
    }

    public void MethodWeb(View view) {
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
        startActivity(intent);
    }

    public void MethodCalender(View view) {
        Intent intent = new Intent(MainActivity.this, CalenderActivity.class);
        startActivity(intent);
    }
}