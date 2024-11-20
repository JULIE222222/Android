package com.example.jejuimg;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    ImageView imgView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("제주도 풍경");

        edit1 = (EditText) findViewById(R.id.Edit1);
        imgView1 = (ImageView) findViewById(R.id.imgView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.Rotate) {
            imgView1.setRotation(Float.parseFloat(edit1.getText().toString()));
            return true;
        } else if (item.getItemId()== R.id.item1) {
            imgView1.setImageResource(R.drawable.jeju1);
            return true;
        } else if (item.getItemId()== R.id.item2) {
            imgView1.setImageResource(R.drawable.jeju2);
            return true;
        } else if (item.getItemId()== R.id.item3) {
            imgView1.setImageResource(R.drawable.jeju4);
            return true;
        }
        return false;
    }

}