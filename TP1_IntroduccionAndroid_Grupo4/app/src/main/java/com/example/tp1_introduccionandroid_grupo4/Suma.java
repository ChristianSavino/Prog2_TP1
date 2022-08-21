package com.example.tp1_introduccionandroid_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suma extends AppCompatActivity {

    private EditText primerNumero;
    private EditText segundoNumero;
    private TextView resultadoSuma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // La clase R es una clase que Android Studio crea automaticamente que nos sirve como puente de comunicacion entre la parte logica y la parte grafica.
        this.setTitle(R.string.Suma);
        setContentView(R.layout.activity_suma);

        primerNumero = (EditText) findViewById(R.id.txtPrimerNumero);
        segundoNumero = (EditText) findViewById(R.id.txtSegundoNumero);
        resultadoSuma = (TextView) findViewById(R.id.txtResultado);
    }

    // Método Sumar
    public void Sumar(View view){
        String val1 = primerNumero.getText().toString();
        String val2 = segundoNumero.getText().toString();

        int num1 = Integer.parseInt(val1);
        int num2 = Integer.parseInt(val2);
        int suma = num1 + num2;

        String resultado = String.valueOf(suma);

        resultadoSuma.setText(resultado);
    }

    //Método de boton Volver
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }


}