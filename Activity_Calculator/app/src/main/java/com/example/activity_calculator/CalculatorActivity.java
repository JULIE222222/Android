package com.example.activity_calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CalculatorActivity extends MainActivity {

    Button btnAdd, btnSub, btnMul, btnDiv, btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        // Intent로 전달된 값 받기
        Intent intent1 = getIntent();
        String strNum1 = intent1.getStringExtra("수1");
        String strNum2 = intent1.getStringExtra("수2");

        // 입력값을 숫자로 변환
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        // 버튼 초기화
        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnback = (Button) findViewById(R.id.BtnBack);


        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent2);
            }
        });
        // 더하기 버튼 클릭 이벤트
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = num1 + num2;
                Toast.makeText(getApplicationContext(), "더하기결과: " + result, Toast.LENGTH_SHORT).show();
            }
        });

        // 빼기 버튼 클릭 이벤트
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = num1 - num2;
                Toast.makeText(getApplicationContext(), "빼기결과: " + result, Toast.LENGTH_SHORT).show();
            }
        });

        // 곱하기 버튼 클릭 이벤트
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double result = num1 * num2;
                Toast.makeText(getApplicationContext(), "곱하기결과: " + result, Toast.LENGTH_SHORT).show();
            }
        });

        // 나누기 버튼 클릭 이벤트
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (num2 != 0) {
                    double result = num1 / num2;
                    Toast.makeText(getApplicationContext(), "나누기결과: " + result, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
