package com.example.tp1_introduccionandroid_grupo4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Método de boton Ejercicio 1

    public void Ejercicio1(View view){
        Intent ejercicio = new Intent(this, Suma.class);
        startActivity(ejercicio);
    }
}