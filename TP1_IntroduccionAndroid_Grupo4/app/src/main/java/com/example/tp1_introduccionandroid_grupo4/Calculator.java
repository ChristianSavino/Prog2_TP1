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
   /*
    private TextView operationTextView;
    private TextView secondOperationTypeTextView;

    //1 Sumar, 2 Restar, 3 Multiplicar y 4 Dividir
    private int operationType;
    private int num1;
    private int num2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Calculadora");
        setContentView(R.layout.activity_calculator);

        //operationTypeTextView = (TextView) findViewById(R.id.operationTypeTextView);
        //secondOperationTypeTextView = (TextView) findViewById(R.id.secondOperationTypeTextView);
    }

    public void SetAdd(View view) {
        PreCalculate(view, operationTextView.getText().toString(),1);
    }

    public void SetSubtract(View view) {
        PreCalculate(view, operationTextView.getText().toString(),2);
    }

    public void SetMultiply(View view) {
        PreCalculate(view, operationTextView.getText().toString(),3);
    }

    public void SetDivide(View view) {
        PreCalculate(view, operationTextView.getText().toString(),4);
    }

    public void One(View view) {
        AddNumber("1");
    }

    public void Back(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }

    public void Delete(View view)
    {
        operationTextView.setText("0");
        secondOperationTypeTextView.setText("");
        operationType = 0;
    }

    void AddNumber(String num) {
        operationTextView.setText(operationTextView.getText().toString() + num);
    }

    void PreCalculate(View view,String num, int opType) {
        if (num1 == 0) {
            num1 = Integer.parseInt(num);
            secondOperationTypeTextView.setText(num + " + ");
            operationTextView.setText("0");
            operationType = opType;
        }
        else {
            num2 = Integer.parseInt(num);
            secondOperationTypeTextView.setText(secondOperationTypeTextView.getText().toString() + num);
            Calculate(view);
            PreCalculate(view,operationTextView.getText().toString(),opType);
        }

    }

    public void Calculate(View view) {
        if(num1 != 0 && num2 != 0 && operationType != 0) {
            String result = "";

            switch (operationType) {
                case 1:
                    result = Sumar(num1,num2);
                    break;
                case 2:
                    result = Restar(num1,num2);
                    break;
                case 3:
                    result = Multiplicar(num1,num2);
                    break;
                case 4:
                    result = Dividir(num1,num2);

                default:
                    //aca mostrar alguna especie de error/ excepcion
            }

            operationTextView.setText(result);
            num1 = 0;
            num2 = 0;
            operationType = 0;
        }
    }

    String Sumar(int n1, int n2) {return Integer.toString(n1 + n2);}
    String Restar(int n1, int n2) {return Integer.toString(n1 - n2);}
    String Multiplicar(int n1,int n2){return Integer.toString(n1 * n2);}
    String Dividir(int n1,int n2){return Integer.toString(n1 / n2);}*/

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
                    pantalla.setText(num1 +"+");
                }
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pantalla.getText().length() != 0) {
                    num1 = Integer.parseInt(pantalla.getText() + "");
                    Restar = true;
                    pantalla.setText(num1 +"-");
                }
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pantalla.getText().length() != 0) {
                    num1 = Integer.parseInt(pantalla.getText() + "");
                    Multiplicar = true;
                    pantalla.setText(num1 +"x");
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pantalla.getText().length() != 0) {
                    num1 = Integer.parseInt(pantalla.getText() + "");
                    Dividir = true;
                    pantalla.setText(num1 +"/");
                }
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Sumar || Restar || Multiplicar || Dividir) {
                    num2 = Integer.parseInt(pantalla.getText() + "");
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
                pantalla.setText("0");
                num1 = 0;
                num2 = 0;
            }
        });

    }

    void AddNumber(String n) {
        if(pantalla.getText() == "0")
            pantalla.setText(n);
        else
            pantalla.setText( pantalla.getText() + n);
    }
}