package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn); //object of button type
        addBtn.setOnClickListener(new View.OnClickListener() { //sets OnClickListener
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText); //object of EditText type
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText); //object of EditText type
                TextView resTextView = (TextView) findViewById(R.id.resTextView); //object of TextView type

                int num1 = Integer.parseInt(firstNumEditText.getText().toString()); //gets the firstEditText value
                int num2 = Integer.parseInt(secondNumEditText.getText().toString()); //gets the secondEditText value
                int result = num1 + num2; //adds the two values
                resTextView.setText(result + ""); //displays the reults

            }
        });
    }
}
