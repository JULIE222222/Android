package com.example.activity_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("메인 액티비티");

        // EditText 초기화
        EditText editNum1 = (EditText) findViewById(R.id.editNum1);
        EditText editNum2 = (EditText) findViewById(R.id.editNum2);

        // 버튼 초기화
        Button btn1 = (Button) findViewById(R.id.Btn1);

        // OnClickListener 등록
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 입력값 가져오기
                String num1 = editNum1.getText().toString();
                String num2 = editNum2.getText().toString();

                // CalculatorActivity로 이동하는 Intent 생성 및 실행
                Intent intent = new Intent(getApplicationContext(), CalculatorActivity.class);
                intent.putExtra("수1", num1);
                intent.putExtra("수2", num2);
                startActivity(intent);
            }
        });
    }
}
