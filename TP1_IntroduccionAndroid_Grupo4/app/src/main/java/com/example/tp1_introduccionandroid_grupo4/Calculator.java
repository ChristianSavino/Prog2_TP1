package com.example.tp1_introduccionandroid_grupo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculator extends AppCompatActivity {

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
    String Dividir(int n1,int n2){return Integer.toString(n1 / n2);}
}
