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

public class ScientistsActivity extends AppCompatActivity {


    private QuestionList nQuestionList = new QuestionList();


    private TextView nScoreView2;
    private ImageView nQuestionView2;
    private Button nButtonChoice1;
    private Button nButtonChoice2;
    private Button nButtonChoice3;
    private Button nButtonChoice4;
    private int nScore = 0;
    public int nQuestionLenght = nQuestionList.nScientistsQuestions.length;
    Random random;

    List<QuestionItem> list;
    int turn = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientists);

        random = new Random();


        nScoreView2 = (TextView) findViewById(R.id.score2);
        nQuestionView2 = (ImageView) findViewById(R.id.scientists_question);
        nButtonChoice1 = (Button) findViewById(R.id.scientistsChoice1);
        nButtonChoice2 = (Button) findViewById(R.id.scientistsChoice2);
        nButtonChoice3 = (Button) findViewById(R.id.scientistsChoice3);
        nButtonChoice4 = (Button) findViewById(R.id.scientistsChoice4);

        list = new ArrayList<>();

        for (int i = 0; i < new QuestionList().nScientistsAnswers.length; i++) {
            list.add(new QuestionItem(new QuestionList().nScientistsAnswers[i], new QuestionList().nScientistsQuestions[i]));
        }

        Collections.shuffle(list);
        newQuestion(turn);



        nButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {

                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toast.makeText(ScientistsActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else if (turn == list.size()){
                        Intent i = new Intent(ScientistsActivity.this, ResultsActivity.class);
                        ScientistsActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    Intent i = new Intent(ScientistsActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    ScientistsActivity.this.finish();
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
                    Toast.makeText(ScientistsActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else if (turn == list.size()){
                        Intent i = new Intent(ScientistsActivity.this, ResultsActivity.class);
                        ScientistsActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    Intent i = new Intent(ScientistsActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    ScientistsActivity.this.finish();
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
                    Toast.makeText(ScientistsActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else if (turn == list.size()){
                        Intent i = new Intent(ScientistsActivity.this, ResultsActivity.class);
                        ScientistsActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    Intent i = new Intent(ScientistsActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    ScientistsActivity.this.finish();
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
                    Toast.makeText(ScientistsActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                    } else if (turn == list.size()){
                        Intent i = new Intent(ScientistsActivity.this, ResultsActivity.class);
                        ScientistsActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    Intent i = new Intent(ScientistsActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    ScientistsActivity.this.finish();
                    startActivity(i);

                }
            }
        });
    }


    private void newQuestion(int number) {

        nQuestionView2.setImageResource(list.get(number - 1).getImage());

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

        nScoreView2.setText("" + nScore);
    }






}





