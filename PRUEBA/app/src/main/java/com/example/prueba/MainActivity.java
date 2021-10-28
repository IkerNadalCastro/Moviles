package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void recorrer(){
        View v;
        LinearLayout g = (LinearLayout) findViewById(R.id.linearLayout1);
        for(int i =0; i <g.getChildCount(); i++)
        {
            v = g.getChildAt(i);
            System.out.println("objeto: " + v.toString());
        }
    }


}