package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    // initialize data
    String[] countryNameList = {
        "India",
        "China",
        "Australia",
        "New Zealand",
        "England",
        "Pakistan"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initiate an auto complete text view
        AutoCompleteTextView simpleAutoCompleteTextView
            = (AutoCompleteTextView) findViewById(R.id.simpleAutoCompleteTextView);
        ArrayAdapter adapter
            = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
            countryNameList
        );

        // Adapter setting
        simpleAutoCompleteTextView.setAdapter(adapter);
        simpleAutoCompleteTextView.setThreshold(1);
        simpleAutoCompleteTextView.setAdapter(adapter);
    }
}