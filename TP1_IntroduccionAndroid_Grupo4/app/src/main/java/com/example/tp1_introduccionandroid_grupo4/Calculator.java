package com.example.tp1_introduccionandroid_grupo4;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {

    private int num1 = 0, num2 = 0;
    private TextView pantalla;
    private boolean Sumar, Restar, Multiplicar, Dividir;
    private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSuma, btnResta,
            btnMult, btnDiv, btnIgual, btnBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn0 = (Button) findViewById(R.id.btnCero);
        btn1 = (Button) findViewById(R.id.btnUno);
        btn2 = (Button) findViewById(R.id.btnDos);
        btn3 = (Button) findViewById(R.id.btnTres);
        btn4 = (Button) findViewById(R.id.btnCuatro);
        btn5 = (Button) findViewById(R.id.btnCinco);
        btn6 = (Button) findViewById(R.id.btnSeis);
        btn7 = (Button) findViewById(R.id.btnSiete);
        btn8 = (Button) findViewById(R.id.btnOcho);
        btn9 = (Button) findViewById(R.id.btnNueve);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnMult = (Button) findViewById(R.id.btnMultiplicar);
        btnDiv = (Button) findViewById(R.id.btnDividir);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);

        pantalla = (TextView) findViewById(R.id.tv1);
        pantalla.setText(null);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "1");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(pantalla.getText() + "0");
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pantalla.getText().length() != 0) {
                    num1 = Integer.parseInt(pantalla.getText() + "");
                    Sumar = true;
                    pantalla.setText(null);
                }
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pantalla.getText().length() != 0) {
                    num1 = Integer.parseInt(pantalla.getText() + "");
                    Restar = true;
                    pantalla.setText(null);
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pantalla.getText().length() != 0) {
                    num1 = Integer.parseInt(pantalla.getText() + "");
                    Multiplicar = true;
                    pantalla.setText(null);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pantalla.getText().length() != 0) {
                    num1 = Integer.parseInt(pantalla.getText().toString() + "");
                    Dividir = true;

                    pantalla.setText(null);
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Sumar || Restar || Multiplicar || Dividir) {
                    num2 = Integer.parseInt(pantalla.getText().toString() + "");

                }

                if (Sumar) {

                    pantalla.setText(num1 + num2 + "");
                    Sumar = false;
                }

                if (Restar) {

                    pantalla.setText(num1 - num2 + "");
                    Restar = false;
                }

                if (Multiplicar) {
                    pantalla.setText(num1 * num2 + "");
                    Multiplicar = false;
                }

                if (Dividir) {
                    pantalla.setText(num1 / num2 + "");
                    Dividir = false;
                }

            }
        });


        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText(null);
                num1 = 0;
                num2 = 0;
            }
        });

    }

    void AddNumber(String n) {
        if(pantalla.getText() == "0")
            pantalla.setText(n);
        else
            pantalla.setText(pantalla.getText() + n);

    }
}
