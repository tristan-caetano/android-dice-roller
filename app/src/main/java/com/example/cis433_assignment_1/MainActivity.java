package com.example.cis433_assignment_1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mText = (TextView) findViewById(R.id.textView);

        Button custom = (Button) findViewById(R.id.customRoll);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent customIntent = new Intent(getApplicationContext(), insertVal.class);
                startActivity(customIntent);
            }
        });

        Button d20 = (Button) findViewById(R.id.d20);
        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(20, mText);
            }
        });

        Button d12 = (Button) findViewById(R.id.d12);
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(12, mText);
            }
        });

        Button d10 = (Button) findViewById(R.id.d10);
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(10, mText);
            }
        });

        Button d8 = (Button) findViewById(R.id.d8);
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(8, mText);
            }
        });

        Button d6 = (Button) findViewById(R.id.d6);
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(6, mText);
            }
        });

        Button d4 = (Button) findViewById(R.id.d4);
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(4, mText);
            }
        });
    }

    public void rollDice(int diceVal, TextView mText){
        Random rand = new Random();
        int printVal = rand.nextInt(diceVal);
        mText.setText(Integer.toString(printVal + 1));
    }
}