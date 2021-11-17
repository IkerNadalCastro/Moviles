package com.example.practica2_hipotenochas;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    //Este metodo solo está hecho para la dificultad facil, luego hay que repetirlo para la media y dificil
    public void init() {

        ArrayList<String> listaHipotenochados = new ArrayList<String>();

        int rowsColsEasy = 8;
        int generadorID = 1;

        TableLayout tl = (TableLayout) findViewById(R.id.TableLayout1);

        for (int filas = 1; filas <= rowsColsEasy; filas ++, generadorID ++) {

            //En esta primera parte hago un generador de tags y creo la fila
            String rowNameGenerator = ("row" + (String.valueOf(filas)));

            TableRow row = new TableRow(this);

            TableRow.LayoutParams trParams = new TableRow.LayoutParams(
                    TableRow.LayoutParams.MATCH_PARENT,
                    TableRow.LayoutParams.MATCH_PARENT,
                    1);

            row.setId(generadorID);
            row.setTag(rowNameGenerator);
            row.setLayoutParams(trParams);

            for (int columnas = 1; columnas <=rowsColsEasy; columnas ++, generadorID ++) {

                //En esta parte hago otro generador de tags que combina el anterior + la columna
                //Creo el boton y lo añado a la fila
                String columnNameGenerator = (rowNameGenerator + "col" + (String.valueOf(columnas)));

                ImageButton boton = new ImageButton(this);

                boton.setId(generadorID);
                boton.setTag(columnNameGenerator);

                boton.setImageResource(R.drawable.elwafels);
                boton.setScaleType(ImageView.ScaleType.FIT_XY);
                boton.setAdjustViewBounds(true);

                boton.setLayoutParams(trParams);

                row.addView(boton);

            }

            //Añado la fila entera con las columnas incluidas al tableLayout

            tl.addView(row);

        } //Fin del for para crear el table layout

        //Aqui va a empezar lo de poner hipotenochas
        /*
        *
        * La idea es que tengo un contador de hipotenochas(las que tienen que salir) y con un Math.random() voy generando un numero entre 1 y el nº total de casillas.
        * Después se busca esa casilla (por ID o Tag) se indica que se ha puesto las hipotenocha y esa casilla se va a añadir al arrayList para que asi si salen casillas repetidas
        * se haga otro numero aleatorio, para que no haya duplicados.
        *
        * */

        int hipotenochasEasy = 10;


    }
}