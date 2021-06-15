package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void numbers(View view){
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);
    }
    public void family(View view){
        Intent intent = new Intent(this, FamilyActivity.class);
        startActivity(intent);
    }

    public void phrases(View view){
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }
    public void colors(View view){
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }

    public void days(View view){
        Intent intent = new Intent(this, DaysActivity.class);
        startActivity(intent);
    }
    public void directions(View view){
        Intent intent = new Intent(this, DirectionsActivity.class);
        startActivity(intent);
    }


}