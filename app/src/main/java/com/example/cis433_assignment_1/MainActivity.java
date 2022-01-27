/*
Tristan Caetano
CIS 433
Homework 1

I made an app that acts as a dice roller for Dungeons and Dragons.
However, custom dice rolls may be done as well
 */

package com.example.cis433_assignment_1;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;

// Main Activity that contains the main DnD dice rolls
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring main text view that contains the dice roll values
        TextView mText = (TextView) findViewById(R.id.textView);

        // Declaring buttons that appear on this menu
        Button custom = (Button) findViewById(R.id.customRoll);
        Button theme = (Button) findViewById(R.id.themeButton);
        Button d20 = (Button) findViewById(R.id.d20);
        Button d12 = (Button) findViewById(R.id.d12);
        Button d10 = (Button) findViewById(R.id.d10);
        Button d8 = (Button) findViewById(R.id.d8);
        Button d6 = (Button) findViewById(R.id.d6);
        Button d4 = (Button) findViewById(R.id.d4);

        // Custom button, when clicked, it sends you to the custom roll menu
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent customIntent = new Intent(getApplicationContext(), insertVal.class);
                startActivity(customIntent);
            }
        });

        // Performs a D20 roll, and displays in the text view
        d20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(20, mText);
            }
        });

        // Performs a D12 roll, and displays in the text view
        d12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(12, mText);
            }
        });

        // Performs a D10 roll, and displays in the text view
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(10, mText);
            }
        });

        // Performs a D8 roll, and displays in the text view
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(8, mText);
            }
        });

        // Performs a D6 roll, and displays in the text view
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(6, mText);
            }
        });

        // Performs a D4 roll, and displays in the text view
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice(4, mText);
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

    // Method that takes in a dice roll ceiling value and displays it in the given text view
    // Used for both menus
    public static void rollDice(int diceVal, TextView mText){
        Random rand = new Random();
        int printVal = rand.nextInt(diceVal);
        mText.setText(Integer.toString(printVal + 1));
    }

    // Changes the button themes to black and white for this menu only
    public void changeTheme(String pTheme, String sTheme){

        Button d20 = (Button) findViewById(R.id.d20);
        Button d12 = (Button) findViewById(R.id.d12);
        Button d10 = (Button) findViewById(R.id.d10);
        Button d8 = (Button) findViewById(R.id.d8);
        Button d6 = (Button) findViewById(R.id.d6);
        Button d4 = (Button) findViewById(R.id.d4);
        Button custom = (Button) findViewById(R.id.customRoll);
        Button theme = (Button) findViewById(R.id.themeButton);

        d20.setTextColor(Color.parseColor(pTheme));
        d20.setBackgroundColor(Color.parseColor(sTheme));
        d12.setTextColor(Color.parseColor(pTheme));
        d12.setBackgroundColor(Color.parseColor(sTheme));
        d10.setTextColor(Color.parseColor(pTheme));
        d10.setBackgroundColor(Color.parseColor(sTheme));
        d8.setTextColor(Color.parseColor(pTheme));
        d8.setBackgroundColor(Color.parseColor(sTheme));
        d6.setTextColor(Color.parseColor(pTheme));
        d6.setBackgroundColor(Color.parseColor(sTheme));
        d4.setTextColor(Color.parseColor(pTheme));
        d4.setBackgroundColor(Color.parseColor(sTheme));
        custom.setTextColor(Color.parseColor(pTheme));
        custom.setBackgroundColor(Color.parseColor(sTheme));
        theme.setTextColor(Color.parseColor(pTheme));
        theme.setBackgroundColor(Color.parseColor(sTheme));

    }
}