package com.example.c4q.inclass0107;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.c4q.inclass0107.enumClasses.MonthsOfTheYear;

import static com.example.c4q.inclass0107.enumClasses.MonthsOfTheYear.JANUARY;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MonthsOfTheYear[] monthsOfTheYear= MonthsOfTheYear.values();
        for (int i = 0; i < monthsOfTheYear.length; i++) {// no we add the code block for the loop
            Log.d("Months",monthsOfTheYear[i].toString());

        }
    }
}
