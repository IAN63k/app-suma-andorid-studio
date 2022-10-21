package com.uniajc.actividad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private TextView txtV;

    public void sumar(View view) {
        String valor1 = num1.getText().toString();
        String valor2 = num2.getText().toString();
        int n1 = Integer.parseInt(valor1);
        int n2 = Integer.parseInt(valor2);
        int suma = n1 + n2;
        String result = String.valueOf(suma);
        txtV.setText(result);
    }

    public EditText getNum1() {
        return num1;
    }

    public EditText getNum2() {
        return num2;
    }

    public void setTxtV(TextView txtV) {
        this.txtV = txtV;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        txtV = findViewById(R.id.txtV);

//        btn = findViewById(R.id.btn);

    }


}