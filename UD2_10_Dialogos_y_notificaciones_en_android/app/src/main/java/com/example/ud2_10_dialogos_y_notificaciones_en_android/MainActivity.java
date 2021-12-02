package com.example.ud2_10_dialogos_y_notificaciones_en_android;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tv = (TextView) findViewById(R.id.textView1);

        creadorDialogo();

    }

    public void creadorDialogo() {

        ArrayList listaOpcionesSeleccionada = new ArrayList();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder //.setMessage(getString(R.string.dialog_message))
                .setTitle(getString(R.string.dialog_title))
                /*.setItems(R.array.options, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        String[] options = getResources().getStringArray(R.array.options);
                        Toast.makeText(getApplicationContext(),options[which], Toast.LENGTH_LONG).show();

                    }
                })*/
                .setMultiChoiceItems(R.array.options, null,
                new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which,
                                        boolean isChecked) {

                        String[] options = getResources().getStringArray(R.array.options);

                        if (isChecked) {

                            listaOpcionesSeleccionada.add(options[which].toString());

                        } else if (!isChecked) {

                            listaOpcionesSeleccionada.remove(options[which].toString());

                        }
                    }
                })
                .setPositiveButton(getString(R.string.ok), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        // User clicked OK button
                        Toast.makeText(getApplicationContext(),getString(R.string.ok), Toast.LENGTH_LONG).show();
                        tv.setText(listaOpcionesSeleccionada.toString());

                    }
                })
                .setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        // User cancelled the dialog
                        Toast.makeText(getApplicationContext(),getString(R.string.cancel), Toast.LENGTH_LONG).show();

                    }
                })


        ;
        AlertDialog dialog = builder.create();
        dialog.show();

    }

}