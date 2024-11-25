package com.example.activityex1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends SecondActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button btnBack2 = (Button) findViewById(R.id.btnBack2);

        btnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
