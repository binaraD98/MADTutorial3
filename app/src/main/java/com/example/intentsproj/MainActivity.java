package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalc = (Button) findViewById(R.id.btnCalc);

        LayoutInflater li = getLayoutInflater();

        View layout = li.inflate(R.layout.custom_toast,(ViewGroup)
                findViewById(R.id.custom_toast_layout));

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout);
        toast.show();

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent FirstActivity = new Intent(MainActivity.this, FirstActivity.class);

                startActivity(FirstActivity);





            }
        });
    }



}