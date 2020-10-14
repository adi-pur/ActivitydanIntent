package com.example.activitydanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondMainActivity extends AppCompatActivity {

    private TextView txtExtra;
    private String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);

        iniData();
        setData();
    }

    public void iniData(){
        txtExtra = findViewById(R.id.txtMainExtra);
    }

    public void setData(){
        Intent move = getIntent();
        txt = move.getStringExtra("1");
        txtExtra.setText(txt);
    }
}