package com.example.thietkegiaodiennguoidung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button BTN;
EditText PTT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BTN = (Button)findViewById(R.id.BTN);
        PTT = (EditText) findViewById(R.id.PTT);
    }

    public void BTN(View view) {
        PTT.getText().toString() ;
    }
}