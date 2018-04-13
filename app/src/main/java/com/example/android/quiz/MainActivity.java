package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton buttonFriends;
    RadioButton buttonParty;
    EditText japaneseWord;
    CheckBox boxVodka;
    CheckBox boxPizza;
    CheckBox boxCake;
    CheckBox boxCoffee;
    RadioButton buttonCycle;
    RadioButton buttonCar;
    RadioButton buttonNails;
    RadioButton buttonRed;
    RadioButton buttonViolet;
    RadioButton buttonPlant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove status bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        buttonFriends = findViewById(R.id.Answer1c);
        buttonParty = findViewById(R.id.Answer2b);
        japaneseWord = findViewById(R.id.Answer3);
        boxVodka = findViewById(R.id.Answer4a);
        boxPizza = findViewById(R.id.Answer4b);
        boxCake = findViewById(R.id.Answer4c);
        boxCoffee = findViewById(R.id.Answer4d);
        buttonCycle = findViewById(R.id.Answer5b);
        buttonCar = findViewById(R.id.Answer6a);
        buttonNails = findViewById(R.id.Answer7d);
        buttonRed = findViewById(R.id.Answer8b);
        buttonViolet = findViewById(R.id.Answer9c);
        buttonPlant = findViewById(R.id.Answer10b);
    }

    public void increaseScore(View view) {

        int score = 0;
        //if the button is selected increase the score by the amount specified
        if (buttonFriends.isChecked()) {
            score += 2;
        }

        if (buttonParty.isChecked()) {
            score += 2;
        }

        //if the box is checked increase the score by the amount specified

        if (boxCake.isChecked() & boxCoffee.isChecked() & !boxVodka.isChecked() & !boxPizza.isChecked() ) {
            score += 2;
        }

        //if the correct text is entered increase the score by the amount specified

        String japanese = japaneseWord.getText().toString();
        if (japanese.equalsIgnoreCase(getString(R.string.y)) || japanese.equalsIgnoreCase(getString(R.string.ya)) ) {
            score += 4;
        }

        //if the button is selected increase the score by the amount specified
        if (buttonCycle.isChecked()) {
            score += 2;
        }

        if (buttonCar.isChecked()) {
            score += 2;
        }

        if (buttonNails.isChecked()) {
            score += 2;
        }

        if (buttonRed.isChecked()) {
            score += 2;
        }

        if (buttonViolet.isChecked()) {
            score += 2;
        }

        if (buttonPlant.isChecked()) {
            score += 2;
        }

        String totalScore = String.valueOf(score);

        //toast appears with the score and a comment

        if (score >= 18) {
            Toast.makeText(this, totalScore + getString(R.string.scoreA), Toast.LENGTH_LONG).show();
        } else if (score >= 10) {
            Toast.makeText(this, totalScore + getString(R.string.scoreB), Toast.LENGTH_LONG).show();
        } else if (score >= 2) {
            Toast.makeText(this, totalScore + getString(R.string.scoreC), Toast.LENGTH_LONG).show();
        } else if (score <= 1) {
            Toast.makeText(this, totalScore + getString(R.string.scoreD), Toast.LENGTH_LONG).show();
        }


    }
}
