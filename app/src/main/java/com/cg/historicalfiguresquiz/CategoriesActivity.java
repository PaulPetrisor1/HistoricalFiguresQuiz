package com.cg.historicalfiguresquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final MediaPlayer soundEffect2 = MediaPlayer.create(this,R.raw.categories_button);


        Button button1 = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button3);
        Button button3 = (Button) findViewById(R.id.button4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundEffect2.start();

                Intent intent = new Intent(getApplicationContext(), ScientistsActivity.class);
                startActivity(intent);
                finish();

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundEffect2.start();

                Intent intent1 = new Intent(getApplicationContext(), PoliticiansActivity.class);
                startActivity(intent1);
                finish();

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundEffect2.start();

                Intent intent = new Intent(getApplicationContext(), ArtistsActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }


    public boolean onCreateOptionsMenu(Menu menu) {
        //this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
