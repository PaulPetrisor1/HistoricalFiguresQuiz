package com.cg.historicalfiguresquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void buttonClickFunction(View v) {

        Intent intent = new Intent(getApplicationContext(), PoliticiansActivity.class);
        startActivity(intent);
    }

    public void buttonClick(View v){

         Intent intent1 = new Intent(getApplicationContext(), ScientistsActivity.class);
         startActivity(intent1);
    }

    public void buttonClick2(View v){

        Intent intent = new Intent(getApplicationContext(), ArtistsActivity.class);
        startActivity(intent);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        //this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
