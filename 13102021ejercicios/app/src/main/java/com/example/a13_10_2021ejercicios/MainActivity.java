package com.example.a13_10_2021ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recorrer();
        anadeHijos();
    }

    public void recorrer(){
        View v = null;
        LinearLayout g = (LinearLayout) findViewById(R.id.linearLayout1);
        for(int i =0; i <g.getChildCount(); i++) {

            v = g.getChildAt(i);
            Log.d("Mi app", "objeto: " + v.toString() + (String) v.getClass().getSimpleName());

            Button b;
            TextView t;

            if (v.getClass().getSimpleName().equals("MaterialButton")) {

                b=(Button) v;
                b.setText(R.string.textoBotonInicial);

            } else if (v.getClass().getSimpleName().equals("MaterialTextView")) {

                t = (TextView) v;
                t.setText(R.string.textoLabelInicial);

            }

        }

    }

    public void anadeHijos() {

        LinearLayout g = (LinearLayout) findViewById(R.id.linearLayout1);
        Button b;
        TextView t = (TextView) findViewById(R.id.textView1);

        for (int i =0; i<2;i++)
        {
            b=new Button (this);
            b.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT));
            String nombre = getString(R.string.textoBotonesCreados);
            int numero = i;
            b.setText(nombre + i);
            b.setId(View.generateViewId());
            b.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {

                    t.setText(nombre + " " + numero);

                }

            });

            g.addView(b,i);
        }
    }



}