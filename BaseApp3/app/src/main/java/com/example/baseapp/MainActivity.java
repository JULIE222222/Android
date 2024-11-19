package com.example.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1); //동작대상이 button에 들어가야함, 메소드 앞에 () 은 형변환을 나타냄
        //이벤트 프로그래밍
        button1.setOnClickListener(new View.OnClickListener() { //설정방법: seton'이벤트수행시 발생하는 동작을 작성'Listener(click과 같은 기능들이 정의되어있음) -> button1객체의 메서드에 대한 보조기구라고 생각하면됨!..?
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"버튼을 눌렀어요",
                Toast.LENGTH_SHORT).show();

            }
        });


    }
}