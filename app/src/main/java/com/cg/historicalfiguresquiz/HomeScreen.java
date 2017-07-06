package com.cg.historicalfiguresquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class HomeScreen extends AppCompatActivity {

    private MediaPlayer ring = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

          final MediaPlayer soundEffect1 = MediaPlayer.create(this,R.raw.homescreen_button);

          Button homeButton = (Button) findViewById(R.id.button);
          MediaPlayer ring= MediaPlayer.create(HomeScreen.this,R.raw.nocturne);
          ring.setLooping(true);
          ring.start();



          homeButton.setOnClickListener(new View.OnClickListener() {

              @Override
              public void onClick(View v) {
                  soundEffect1.start();
                  Intent intent = new Intent(getApplicationContext(),CategoriesActivity.class);
                  startActivity(intent);


              }
          });

    }


    public void OnDestroy(){
        super.onDestroy();
        onBackPressed();


    }

    public boolean onCreateOptionsMenu(Menu menu){
        //this adds items to the action bar
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    public boolean OnOptionsItemSelected(MenuItem item){


        int id = item.getItemId();
        switch (id){
            case R.id.action_settings:
                 return true;
            case R.id.action_about:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}