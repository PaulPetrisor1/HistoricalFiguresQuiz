package com.cg.historicalfiguresquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ResultsActivity extends AppCompatActivity {

    TextView nCongratiulation, nYouWon;
    Button nExitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        nCongratiulation = (TextView) findViewById(R.id. Congratulations);
        nYouWon = (TextView) findViewById(R.id.YouWon);
        nExitButton = (Button) findViewById(R.id.exitbutton);


        nExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultsActivity.this, HomeScreen.class));
                ResultsActivity.this.finish();
            }
        });


    }

}
