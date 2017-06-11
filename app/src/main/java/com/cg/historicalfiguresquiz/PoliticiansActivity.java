package com.cg.historicalfiguresquiz;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.provider.MediaStore;
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

import es.dmoral.toasty.Toasty;


public class PoliticiansActivity extends AppCompatActivity {

    private QuestionList nQuestionList = new QuestionList();


    private TextView nScoreView;
    private TextView nTime;
    private ImageView nQuestionView;
    private Button nButtonChoice1;
    private Button nButtonChoice2;
    private Button nButtonChoice3;
    private Button nButtonChoice4;
    private int nScore = 0;
    public int nQuestionLenght = nQuestionList.nQuestions.length;
    private CountDownTimer countDownTimer;
    Random random;

    List<QuestionItem> list;
    int turn = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politicians);

        random = new Random();


        nScoreView = (TextView) findViewById(R.id.score);
        nQuestionView = (ImageView) findViewById(R.id.lenin_question);
        nButtonChoice1 = (Button) findViewById(R.id.choice1);
        nButtonChoice2 = (Button) findViewById(R.id.choice2);
        nButtonChoice3 = (Button) findViewById(R.id.choice3);
        nButtonChoice4 = (Button) findViewById(R.id.choice4);
        nTime = (TextView) findViewById(R.id.timer);

        final MediaPlayer correctButtonMP = MediaPlayer.create(this,R.raw.correct_button);
        final MediaPlayer falseButtonMP = MediaPlayer.create(this,R.raw.false_button);
        final MediaPlayer clockMP = MediaPlayer.create(this,R.raw.ticktock);

        list = new ArrayList<>();

        for (int i = 0; i < new QuestionList().nAnswers.length; i++) {
            list.add(new QuestionItem(new QuestionList().nAnswers[i], new QuestionList().nQuestions[i]));

        }

        Collections.shuffle(list);
        newQuestion(turn);
        start();


        //Button 1 Listener

        nButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice1.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {

                    correctButtonMP.start();

                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toasty.success(PoliticiansActivity.this, "Correct", Toast.LENGTH_SHORT,true).show();

                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                        countDownTimer.start();

                    } else if (turn == list.size()){
                       countDownTimer.cancel();
                        Intent i = new Intent(PoliticiansActivity.this, ResultsActivity.class);
                        PoliticiansActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    falseButtonMP.start();
                    countDownTimer.cancel();
                    Toasty.error(PoliticiansActivity.this, "False", Toast.LENGTH_SHORT,true).show();
                    Intent i = new Intent(PoliticiansActivity.this, Results2Activity.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore", nScore);
                        i.putExtras(bundle);

                    PoliticiansActivity.this.finish();
                        startActivity(i);

                }
            }
        });


//end of button listener


        nButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice2.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {

                    correctButtonMP.start();
                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toasty.success(PoliticiansActivity.this, "Correct", Toast.LENGTH_SHORT,true).show();


                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                        countDownTimer.start();

                    }  else if (turn == list.size()){
                        countDownTimer.cancel();
                        Intent i = new Intent(PoliticiansActivity.this, ResultsActivity.class);
                        PoliticiansActivity.this.finish();
                        startActivity(i);

                    }
                } else {
                    countDownTimer.cancel();
                    falseButtonMP.start();Toasty.error(PoliticiansActivity.this, "False", Toast.LENGTH_SHORT,true).show();
                    Intent i = new Intent(PoliticiansActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    PoliticiansActivity.this.finish();
                    startActivity(i);

                }
            }
        });


        nButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice3.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {

                    correctButtonMP.start();
                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toasty.success(PoliticiansActivity.this, "Correct", Toast.LENGTH_SHORT,true).show();


                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                       countDownTimer.start();
                    }  else if (turn == list.size()){
                        countDownTimer.cancel();
                        Intent i = new Intent(PoliticiansActivity.this, ResultsActivity.class);
                        PoliticiansActivity.this.finish();
                        startActivity(i);

                    }
                } else {

                   countDownTimer.cancel();
                    falseButtonMP.start();
                    Toasty.error(PoliticiansActivity.this, "False", Toast.LENGTH_SHORT,true).show();
                    Intent i = new Intent(PoliticiansActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    PoliticiansActivity.this.finish();
                    startActivity(i);
                }
            }
        });


        nButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nButtonChoice4.getText().toString().equalsIgnoreCase(list.get(turn - 1).getName())) {
                    correctButtonMP.start();
                    nScore = nScore + 1;
                    updateScore(nScore);
                    Toasty.success(PoliticiansActivity.this, "Correct", Toast.LENGTH_SHORT,true).show();


                    if (turn<list.size()) {
                        turn++;
                        newQuestion(turn);
                        countDownTimer.start();

                    }  else if (turn == list.size()){
                       countDownTimer.cancel();
                        Intent i = new Intent(PoliticiansActivity.this, ResultsActivity.class);
                        PoliticiansActivity.this.finish();
                        startActivity(i);

                    }
                } else {

                    falseButtonMP.start();
                    countDownTimer.cancel();
                    Toasty.error(PoliticiansActivity.this, "False", Toast.LENGTH_SHORT,true).show();
                    Intent i = new Intent(PoliticiansActivity.this, Results2Activity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("finalScore", nScore);
                    i.putExtras(bundle);

                    PoliticiansActivity.this.finish();
                    startActivity(i);

                }
            }
        });
    }


    private void newQuestion(int number) {

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


   private void start(){

       nTime.setText("15");

       countDownTimer = new CountDownTimer(15 * 1000,1000){

           @Override
           public void onTick(long millisUntilFinished) {
               nTime.setText("" + millisUntilFinished / 1000);
           }

           @Override
           public void onFinish() {

               Intent i = new Intent(PoliticiansActivity.this, Results2Activity.class);
               Bundle bundle = new Bundle();
               bundle.putInt("finalScore", nScore);
               i.putExtras(bundle);

               PoliticiansActivity.this.finish();
               startActivity(i);


           }



       };
      countDownTimer.start();
   }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        countDownTimer.cancel();

    }

    private void cancel() {

    if(countDownTimer != null){
        countDownTimer.cancel();
        countDownTimer = null;
    }
}

}










