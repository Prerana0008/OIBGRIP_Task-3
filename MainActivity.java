package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextWeight = findViewById(R.id.weight);
        EditText editTextHeight = findViewById(R.id.height);
        Button button = findViewById(R.id.btnSubmit);
        TextView textView = findViewById(R.id.result);
        EditText e=findViewById(R.id.editTextText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float weight = Float.parseFloat(String.valueOf(editTextWeight.getText()));
                float height = Float.parseFloat(String.valueOf(editTextHeight.getText()));
                float bmi = ((weight/(height*height))*10000);

                textView.setText(String.valueOf(bmi));
                if(bmi<18.5){
                    e.setText("UnderWeight");
                } else if (bmi>=18.5 && bmi<24.9) {
                    e.setText("Normal weight");
                } else if (bmi>=25 && bmi<29.9) {
                    e.setText("overweight");
                }
                else
                    e.setText("obese");
            }
        });
    }
}
