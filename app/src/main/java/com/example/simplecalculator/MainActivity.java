package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add_button = findViewById(R.id.addition_btn);
        Button subtract_button = findViewById(R.id.subtraction_btn);
        Button multiply_button = findViewById(R.id.multiplication_btn);
        Button divide_button = findViewById(R.id.division_btn);
        Button clear_button = findViewById(R.id.clear_btn);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add(v);
            }
        });

        subtract_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Subtract(v);
            }
        });

        multiply_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiply(v);
            }
        });

        divide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Divide(v);
            }
        });

        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Clear(v);
            }
        });




    }

    public void Add(View v){
        EditText et1 = (EditText) findViewById(R.id.first_num);
        EditText et2 = (EditText) findViewById(R.id.second_num);
        EditText et3 = (EditText) findViewById(R.id.answer_field);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1+n2;

        et3.setText("Total Answer: "+result);

    }

    public void Subtract(View v){
        EditText et1 = (EditText) findViewById(R.id.first_num);
        EditText et2 = (EditText) findViewById(R.id.second_num);
        EditText et3 = (EditText) findViewById(R.id.answer_field);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1-n2;

        et3.setText("Total Answer: "+result);

    }

    public void Multiply(View v){
        EditText et1 = (EditText) findViewById(R.id.first_num);
        EditText et2 = (EditText) findViewById(R.id.second_num);
        EditText et3 = (EditText) findViewById(R.id.answer_field);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1*n2;

        et3.setText("Total Answer: "+result);

    }

    public void Divide(View v){
        EditText et1 = (EditText) findViewById(R.id.first_num);
        EditText et2 = (EditText) findViewById(R.id.second_num);
        EditText et3 = (EditText) findViewById(R.id.answer_field);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;

        et3.setText("Total Answer: "+result);

    }

    public void Clear(View v){
        EditText et1 = (EditText) findViewById(R.id.first_num);
        EditText et2 = (EditText) findViewById(R.id.second_num);
        EditText et3 = (EditText) findViewById(R.id.answer_field);

        et1.setText("");
        et2.setText("");
        et3.setText("");

    }
}