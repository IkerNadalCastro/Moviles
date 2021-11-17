package com.example.practica2_hipotenochas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init() {

        int rowsColsEasy = 8;
        int rowsColsMedium = 12;
        int rowsColsHard = 16;

        int generadorID = 1;

        int hipotenochasEasy = 10;
        int hipotenochasMedium = 20;
        int hipotenochasHard = 30;

        TableLayout tl = (TableLayout) findViewById(R.id.TableLayout1);

        //https://stackoverflow.com/questions/12833430/layout-parameters-for-tablerow-views
        //https://stackoverflow.com/questions/18207470/adding-table-rows-dynamically-in-android
        //links para layout parameters

        for (int filas = 1; filas <= rowsColsEasy; filas ++, generadorID ++) {

            //En esta primera parte hago un generador de tags y creo la fila
            String rowNameGenerator = ("row" + (String.valueOf(filas)));

            TableRow.LayoutParams tlParams = new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.MATCH_PARENT);

            TableRow rowCreada = new TableRow(this);
            rowCreada.setId(generadorID);
            rowCreada.setTag(rowNameGenerator);

            for (int columnas = 1; columnas <=rowsColsEasy; columnas ++, generadorID ++) {

                //En esta parte hago otro generador de tags que combina el anterior + la columna
                //Creo el boton y lo añado a la fila
                String columnNameGenerator = (rowNameGenerator + "col" + (String.valueOf(columnas)));

                Button boton = new Button(this);
                boton.setId(generadorID);
                boton.setTag(columnNameGenerator);
                rowCreada.addView(boton);

            }

            //Añado la fila entera con las columnas incluidas al tableLayout

            tl.addView(rowCreada);

        }

    }
}