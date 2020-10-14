package com.example.activitydanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1, btn2, btn3;
    private String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniData();
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    public void iniData(){
        btn1 = findViewById(R.id.btnMainOne);
        btn2 = findViewById(R.id.btnMainTwo);
        btn3 = findViewById(R.id.btnMainThree);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnMainOne:
                Intent move = new Intent(MainActivity.this, SecondMainActivity.class);
                txt = btn1.getText().toString();
                move.putExtra("1", txt);
                startActivity(move);
                break;
            case R.id.btnMainTwo:
                Intent move2 = new Intent(MainActivity.this, SecondMainActivity.class);
                txt = btn2.getText().toString();
                move2.putExtra("1", txt);
                startActivity(move2);
                break;
            case  R.id.btnMainThree:
                Intent move3 = new Intent(MainActivity.this, SecondMainActivity.class);
                txt = btn3.getText().toString();
                move3.putExtra("1", txt);
                startActivity(move3);
                break;
        }
    }
}