package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button b;
    EditText editNum1, editNum2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editNum1 = (EditText) findViewById(R.id.editNum1);
        editNum2 = (EditText) findViewById(R.id.editNum2);
        b = (Button) findViewById(R.id.buttonOk);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Num1 = editNum1.getText().toString();
                String Num2 = editNum2.getText().toString();

                //Toast.makeText(MainActivity.this, "OK button is just clicked...", Toast.LENGTH_SHORT).show();
                Intent FirstActivity = new Intent(FirstActivity.this,SecondActivity.class);

                FirstActivity.putExtra("No1", Num1);
                FirstActivity.putExtra("No2", Num2);

                startActivity(FirstActivity);

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();
                toast.setGravity(Gravity.CENTER|Gravity.LEFT,250,250);



            }
        });

    }


}