package com.example.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the view that shows the Numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        //set the clickListener to that view
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open a NumbersActivity
                Intent numbersIntent = new Intent(MainActivity.this,
                        NumbersActivity.class);
                //start the new activity
                startActivity(numbersIntent);
            }
        });


        //Find the view that shows the colors category
        TextView colors = (TextView)findViewById(R.id.colors);
        //set the clickListener to that view
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open a ColorsActivity
                Intent colorsIntent = new Intent(MainActivity.this,
                        ColorsActivity.class);
                //start the new activity
                startActivity(colorsIntent);
            }
        });


        //Find the view that shows the Phrases category
        TextView phrases = (TextView)findViewById(R.id.phrases);
        //set the clickListener to that view
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open a PhrasesActivity
                Intent phrasesIntent = new Intent(MainActivity.this,
                        PhrasesActivity.class);
                //start the new activity
                startActivity(phrasesIntent);
            }
        });


        //Find the view that shows the Family category
        TextView family = (TextView)findViewById(R.id.family);
        //set the clickListener to that view
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to open a FamilyActivity
                Intent familyIntent = new Intent(MainActivity.this,
                        FamilyMembersActivity.class);
                //start the new activity
                startActivity(familyIntent);
            }
        });

    }
}
