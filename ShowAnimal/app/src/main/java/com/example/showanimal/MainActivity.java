package com.example.showanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoFox, rdoHorse;
    Button btnOK;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (TextView) findViewById(R.id.Text1);
        chkAgree = (CheckBox) findViewById(R.id.CheAgree);

        text2 = (TextView) findViewById(R.id.Text2);
        rGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        rdoHorse = (RadioButton) findViewById(R.id.RdoHorse);
        rdoFox = (RadioButton) findViewById(R.id.RdoFox);

        btnOK = (Button) findViewById(R.id.BtnOK);
        imgPet = (ImageView) findViewById(R.id.ImgPet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkAgree.isChecked()) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOK.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOK.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                int selectedId = rGroup1.getCheckedRadioButtonId();

                if (selectedId == R.id.RdoDog) {
                    imgPet.setImageResource(R.drawable.dog);
                } else if (selectedId == R.id.RdoCat) {
                    imgPet.setImageResource(R.drawable.cat);
                } else if (selectedId == R.id.RdoHorse) {
                    imgPet.setImageResource(R.drawable.horse);
                } else if (selectedId == R.id.RdoFox) {
                    imgPet.setImageResource(R.drawable.fox);
                } else {
                        Toast.makeText(MainActivity.this, "동물 먼저 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}