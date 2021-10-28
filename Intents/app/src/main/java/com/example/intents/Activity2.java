package com.example.intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    Button b;
    TextView tv2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2style);
        tv2 = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        //tv2.setText(intent.getStringExtra("string1Activity1")); primer ejercicio del putextra()
        //tv2.setText(intent.getStringExtra("objIntentActivity1")); segundo ejercicio del putextra()

    }

}
