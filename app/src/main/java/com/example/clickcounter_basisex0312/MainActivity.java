package com.example.clickcounter_basisex0312;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int sumclick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        sumclick = 0;
    }

    public void clicking(View view) {
        sumclick = sumclick + 1;
        btn.setText("This is a click number:" + sumclick );
    }
}
