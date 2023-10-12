package com.example.ejercicioclase0410;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cuenta(View vista) {
        int numero=0;
        int numero2=0;
        TextView myTextView = null;
        RadioButton valor = (RadioButton) findViewById(R.id.radioSum);
        RadioButton valor2 = (RadioButton) findViewById(R.id.radioRes);
        EditText x = (EditText) findViewById(R.id.editTextValor1);
        EditText y = (EditText) findViewById(R.id.editTextValor2);
        try {



            numero = Integer.parseInt(x.getText().toString());
            numero2 = Integer.parseInt(y.getText().toString());


        } catch (NumberFormatException e) {
            Toast.makeText(this, "Caracter erroneo", Toast.LENGTH_SHORT).show();
        }

        myTextView = (TextView) findViewById(R.id.editTextRes);
                if (valor.isChecked()) {
                    int resultado = numero + numero2;
                    String cadena = String.valueOf(resultado);
                    myTextView.setText(cadena);
                }

                    if (valor2.isChecked()){
                        int resultado = numero - numero2;
                        String cadena = String.valueOf(resultado);
                        myTextView.setText(cadena);
                    }

        }

    public Dialog AcercaDe(View vista) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Programador")
                .setMessage("Alvaro Garcia guisado")
                .setPositiveButton("Cancelar", new DialogInterface.OnClickListener() {
                public  void onClick(DialogInterface dialog,int id){

                }
                });
        builder.show();
        return builder.create();



    }

    public Dialog Salir(View vista){

    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("Menu Salir")
            .setMessage("¿Seguro que quieres salir?")
            .setPositiveButton("Cancelar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            })
            //IMPORTANTE: MIRAR EL LUNES
            //.setNegativeButton("Aceptar", ((dialogInterface, which) -> finish() ))
            .setNegativeButton("Aceptar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });




        builder.show();
        return builder.create();
    }


    }
