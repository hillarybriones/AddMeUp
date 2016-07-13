package com.example.hillarybriones.addmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText firstNumber;
    private EditText secondNumber;
    private TextView addResult;
    private Button Add;

    double num1,num2,sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText)findViewById(R.id.mEtInput1);
        secondNumber = (EditText)findViewById(R.id.mEtInput2);
        addResult = (TextView)findViewById(R.id.txtResult);
        Add = (Button)findViewById(R.id.btnAdd);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    num1 = Double.parseDouble(firstNumber.getText().toString());
                    num2 = Double.parseDouble(secondNumber.getText().toString());
                    sum = num1 + num2;
                    addResult.setText(Double.toString(sum));

            }
        });

    }
}
