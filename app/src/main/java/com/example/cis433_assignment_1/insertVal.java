/*
Tristan Caetano
CIS 433
Homework 1

I made an app that acts as a dice roller for Dungeons and Dragons.
However, custom dice rolls may be done as well
 */

package com.example.cis433_assignment_1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

// Secondary Activity that allows the user to do custom dice rolls
public class insertVal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_val);

        // Declaring buttons that appear on this menu
        Button back = (Button) findViewById(R.id.backButton);
        Button roll = (Button) findViewById(R.id.submitButton);
        Button theme = (Button) findViewById(R.id.themeButton2);

        // Declaring number input text box
        EditText inVal = (EditText) findViewById(R.id.editTextNumber);

        // Declaring main text view that contains the dice roll values
        TextView m2Text = (TextView) findViewById(R.id.textView2);

        // Back button that will bring the user back to the main menu
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(backIntent);
            }
        });

        // Button that will take the number in the input box as a roll ceiling value, and roll it
        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.rollDice(Integer.valueOf(inVal.getText().toString()), m2Text);
            }
        });

        // Changes the button themes to black and white until the menu is changed
        theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeTheme("#000000", "#FFFFFF");
            }
        });

    }

    // Changes the button themes to black and white for this menu only
    public void changeTheme(String pTheme, String sTheme){

        Button submit = (Button) findViewById(R.id.submitButton);
        Button back = (Button) findViewById(R.id.backButton);
        Button theme = (Button) findViewById(R.id.themeButton2);

        submit.setTextColor(Color.parseColor(pTheme));
        submit.setBackgroundColor(Color.parseColor(sTheme));
        back.setTextColor(Color.parseColor(pTheme));
        back.setBackgroundColor(Color.parseColor(sTheme));
        theme.setTextColor(Color.parseColor(pTheme));
        theme.setBackgroundColor(Color.parseColor(sTheme));

    }
}