package com.example.professor.myapplication;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btCalcularClickListener(View v) {

        CheckBox chkArroz = (CheckBox) findViewById(R.id.chkArroz);
        CheckBox chkCarne = (CheckBox) findViewById(R.id.chkCarne);
        CheckBox chkFeijao = (CheckBox) findViewById(R.id.chkFeijao);
        CheckBox chkLeite = (CheckBox) findViewById(R.id.chkLeite);

        EditText editTextQuantidadeArroz = (EditText) findViewById(R.id.editTextQuantidadeArroz);
        EditText editTextQuantidadeCarne = (EditText) findViewById(R.id.editTextQuantidadeCarne);
        EditText editTextQuantidadeFeijao = (EditText) findViewById(R.id.editTextQuantidadeFeijao);
        EditText editTextQuantidadeLeite = (EditText) findViewById(R.id.editTextQuantidadeLeite);

        EditText editTextPrecoArroz = (EditText) findViewById(R.id.editTextPrecoArroz);
        EditText editTextPrecoCarne = (EditText) findViewById(R.id.editTextPrecoCarne);
        EditText editTextPrecoFeijao = (EditText) findViewById(R.id.editTextPrecoFeijao);
        EditText editTextPrecoLeite = (EditText) findViewById(R.id.editTextPrecoLeite);

        double total = 0.0;

        if (chkArroz.isChecked()) total += Double.parseDouble(editTextQuantidadeArroz.getText().toString()) *
                Double.parseDouble(editTextPrecoArroz.getText().toString());

        if (chkCarne.isChecked()) total += Double.parseDouble(editTextQuantidadeCarne.getText().toString()) *
                Double.parseDouble(editTextPrecoCarne.getText().toString());;

        if (chkFeijao.isChecked()) total += Double.parseDouble(editTextQuantidadeFeijao.getText().toString()) *
                Double.parseDouble(editTextPrecoFeijao.getText().toString());;

        if (chkLeite.isChecked()) total += Double.parseDouble(editTextQuantidadeLeite.getText().toString()) *
                Double.parseDouble(editTextPrecoLeite.getText().toString());;

            AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);

            alerta.setMessage("Total das compras: R$ " + total);

            alerta.setNeutralButton("Ok", null);

            alerta.show();
    }
}

