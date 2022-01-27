package com.example.cis433_assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class insertVal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_val);

        EditText inVal = (EditText) findViewById(R.id.editTextNumber);
        TextView m2Text = (TextView) findViewById(R.id.textView2);
        MainActivity main = new MainActivity();

        Button back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backIntent);
            }
        });

        Button roll = (Button) findViewById(R.id.submitButton);
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                main.rollDice(Integer.valueOf(inVal.getText().toString()), m2Text);
            }
        });
    }
}