package com.cg.historicalfiguresquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArtistsActivity extends AppCompatActivity {

    private QuestionList nQuestionList = new QuestionList();


    private TextView nScoreView;
    private ImageView nQuestionView;
    private Button nButtonChoice1;
    private Button nButtonChoice2;
    private Button nButtonChoice3;
    private Button nButtonChoice4;
    private int nScore = 0;
    public int nQuestionLenght = nQuestionList.nArtistsQuestions.length;
    Random random;

    List<QuestionItem> list;
    int turn = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);


        random = new Random();


        nScoreView = (TextView) findViewById(R.id.score3);
        nQuestionView = (ImageView) findViewById(R.id.artistsQuestion);
        nButtonChoice1 = (Button) findViewById(R.id.artistschoice1);
        nButtonChoice2 = (Button) findViewById(R.id.artistschoice2);
        nButtonChoice3 = (Button) findViewById(R.id.artistschoice3);
        nButtonChoice4 = (Button) findViewById(R.id.artistschoice4);

        list = new ArrayList<>();

        for (int i = 0; i < new QuestionList().nArtistsAnswers.length; i++) {
            list.add(new QuestionItem(new QuestionList().nArtistsAnswers[i], new QuestionList().nArtistsQuestions[i]));

        }

        Collections.shuffle(list);
        newQuestion(turn);



        nButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {

                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toast.makeText(ArtistsActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else if (turn == list.size()){
                        Intent i = new Intent(ArtistsActivity.this, ResultsActivity.class);
                        ArtistsActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    Intent i = new Intent(ArtistsActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    ArtistsActivity.this.finish();
                    startActivity(i);

                }
            }
        });


//end of button listener


        nButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {

                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toast.makeText(ArtistsActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else if (turn == list.size()){
                        Intent i = new Intent(ArtistsActivity.this, ResultsActivity.class);
                        ArtistsActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    Intent i = new Intent(ArtistsActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    ArtistsActivity.this.finish();
                    startActivity(i);

                }
            }
        });


        nButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice3.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {

                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toast.makeText(ArtistsActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else if (turn == list.size()){
                        Intent i = new Intent(ArtistsActivity.this, ResultsActivity.class);
                        ArtistsActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    Intent i = new Intent(ArtistsActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    ArtistsActivity.this.finish();
                    startActivity(i);

                }
            }
        });


        nButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice4.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {

                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toast.makeText(ArtistsActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else if (turn == list.size()){
                        Intent i = new Intent(ArtistsActivity.this, ResultsActivity.class);
                        ArtistsActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    Intent i = new Intent(ArtistsActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    ArtistsActivity.this.finish();
                    startActivity(i);

                }
            }
        });

    }

    private void newQuestion(int number){

        nQuestionView.setImageResource(list.get(number - 1).getImage());

        int correct_answer = random.nextInt(4) + 1;

        int firstButton = number - 1;
        int secondButton;
        int thirdButton;
        int forthButton;

        switch (correct_answer) {
            case 1:
                nButtonChoice1.setText(list.get(firstButton).getName());

                do {
                    secondButton = random.nextInt(list.size());
                } while (secondButton == firstButton);


                do {
                    thirdButton = random.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);


                do {
                    forthButton = random.nextInt(list.size());
                }
                while (forthButton == firstButton || forthButton == secondButton || forthButton == thirdButton);


                nButtonChoice2.setText(list.get(secondButton).getName());
                nButtonChoice3.setText(list.get(thirdButton).getName());
                nButtonChoice4.setText(list.get(forthButton).getName());


                break;

            case 2:
                nButtonChoice2.setText(list.get(firstButton).getName());

                do {
                    secondButton = random.nextInt(list.size());
                } while (secondButton == firstButton);


                do {
                    thirdButton = random.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);


                do {
                    forthButton = random.nextInt(list.size());
                }
                while (forthButton == firstButton || forthButton == secondButton || forthButton == thirdButton);


                nButtonChoice1.setText(list.get(secondButton).getName());
                nButtonChoice3.setText(list.get(thirdButton).getName());
                nButtonChoice4.setText(list.get(forthButton).getName());


                break;

            case 3:

                nButtonChoice3.setText(list.get(firstButton).getName());

                do {
                    secondButton = random.nextInt(list.size());
                } while (secondButton == firstButton);


                do {
                    thirdButton = random.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);


                do {
                    forthButton = random.nextInt(list.size());
                }
                while (forthButton == firstButton || forthButton == secondButton || forthButton == thirdButton);


                nButtonChoice2.setText(list.get(secondButton).getName());
                nButtonChoice1.setText(list.get(thirdButton).getName());
                nButtonChoice4.setText(list.get(forthButton).getName());

                break;

            case 4:
                nButtonChoice4.setText(list.get(firstButton).getName());

                do {
                    secondButton = random.nextInt(list.size());
                } while (secondButton == firstButton);


                do {
                    thirdButton = random.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);


                do {
                    forthButton = random.nextInt(list.size());
                }
                while (forthButton == firstButton || forthButton == secondButton || forthButton == thirdButton);


                nButtonChoice2.setText(list.get(secondButton).getName());
                nButtonChoice3.setText(list.get(thirdButton).getName());
                nButtonChoice1.setText(list.get(forthButton).getName());


                break;


        }

    }

    private void updateScore(int point) {

        nScoreView.setText("" + nScore);
    }





}
