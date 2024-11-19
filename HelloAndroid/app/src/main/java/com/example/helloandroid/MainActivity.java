package com.example.helloandroid;  //package에 소속된다는 의미

import androidx.appcompat.app.AppCompatActivity;  //import: AppCompatActivity를 가져와라 -> 안에 있는 함수들(기능들)..

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}