package com.example.activityex2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("직접 풀어보기 10-1");

        Button btnNew1 = (Button) findViewById(R.id.btnNew1);
        RadioButton rdoSecond = (RadioButton) findViewById(R.id.RdoSecond);
        RadioButton rdoThrid = (RadioButton) findViewById(R.id.RdoThird);

        btnNew1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;

                if(rdoSecond.isChecked() ==true){
                    intent = new Intent(getApplicationContext(), SecondActivity.class);

                } else{
                    intent = new Intent(getApplicationContext(), ThirdActivity.class);
                }
                startActivity(intent);
            }
        });





    }
}