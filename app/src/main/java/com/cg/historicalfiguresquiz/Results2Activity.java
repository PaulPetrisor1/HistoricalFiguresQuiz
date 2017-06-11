package com.cg.historicalfiguresquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Results2Activity extends AppCompatActivity {



   Button nExitButton;
   TextView nYouScored;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results2);

        nExitButton = (Button) findViewById(R.id.exitbutton);
        nYouScored = (TextView) findViewById(R.id.youscored);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        nYouScored.setText("You scored " + score + " out of " + "32");






        nExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Results2Activity.this, CategoriesActivity.class));
                Results2Activity.this.finish();
            }
        });

    }

}
