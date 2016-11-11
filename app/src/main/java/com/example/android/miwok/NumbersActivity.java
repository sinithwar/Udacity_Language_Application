package com.example.android.miwok;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;



public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout numbersView = (LinearLayout) findViewById(R.id.numbersView);

        int counter = 0;
        while (counter < words.size()){
            TextView word = new TextView(this);
            word.setText(words.get(counter));
            numbersView.addView(word);
            counter++;
        }
    }

}
