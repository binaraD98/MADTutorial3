package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textNo1,textNo2,textAns;
    Button btnPlus,btnMinus,btnMulty,btnSub;
    float result;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textNo1 = (TextView) findViewById(R.id.textNo1);
        textNo2 = (TextView) findViewById(R.id.textNo2);

        textAns = (TextView) findViewById(R.id.textAns);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMulty = (Button) findViewById(R.id.btnMulty);
        btnSub = (Button) findViewById(R.id.btnSub);

        textNo1.setText(getIntent().getStringExtra("No1"));
        textNo2.setText(getIntent().getStringExtra("No2"));

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(textNo1.getText().toString());
                num2 = Integer.parseInt(textNo2.getText().toString());

                result = num1 + num2;

                textAns.setText(String.valueOf(num1) + " + " + String.valueOf(num2)+ " = " + String.valueOf(result));

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(textNo1.getText().toString());
                num2 = Integer.parseInt(textNo2.getText().toString());

                result = num1 - num2;

                textAns.setText(String.valueOf(num1) + " - " + String.valueOf(num2)+ " = " + String.valueOf(result));

            }
        });

        btnMulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(textNo1.getText().toString());
                num2 = Integer.parseInt(textNo2.getText().toString());

                result = num1 * num2;

                textAns.setText(String.valueOf(num1) + " * " + String.valueOf(num2)+ " = " + String.valueOf(result));

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(textNo1.getText().toString());
                num2 = Integer.parseInt(textNo2.getText().toString());

                result = num1 / num2;

                textAns.setText(String.valueOf(num1) + " / " + String.valueOf(num2)+ " = " + String.valueOf(result));

            }
        });





    }
}