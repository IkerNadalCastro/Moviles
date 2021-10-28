package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class Activity1 extends AppCompatActivity implements Serializable {

    Button b;
    objetointent oi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1style);
        b = (Button) findViewById(R.id.button1a2);
        //oi = (objetointent) new objetointent("Iker", 19, 180, "Masculino", 0); segundo ejercicio del putextra
        buttonAction();
    }

    public void buttonAction () {

        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent explicitIntent1 = new Intent(v.getContext(), Activity2.class);
                //explicitIntent1.putExtra("string1Activity1", "si se muestra esta string es que esto va bien"); primer ejercicio del putextra()
                //explicitIntent1.putExtra("objIntentActivity1", oi.toString()); segundo ejercicio del putextra()
                startActivity(explicitIntent1);

            }

        });

    }

}