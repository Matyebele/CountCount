package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeanB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public  void pointsThreeTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public  void pointsThreeTeamB(View v){
        scoreTeanB = scoreTeanB + 3;
        DisplayForTeamB(scoreTeanB);
    }
public  void  pointsTwoTeamA(View view){
    scoreTeamA = scoreTeamA + 2;
    displayForTeamA(scoreTeamA);
}
    public void pointsTwoTeamB(View v){
        scoreTeanB=scoreTeanB+2;
        DisplayForTeamB(scoreTeanB);
    }
    public  void  pointsOneTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void pointsOneTeamB(View v){
        scoreTeanB=scoreTeanB+1;
        DisplayForTeamB(scoreTeanB);
    }
public void resetScore(View v){
    scoreTeanB=0;
    scoreTeamA=0;
    displayForTeamA(scoreTeamA);
    DisplayForTeamB(scoreTeanB);


}
  public  void displayForTeamA(int score){
      TextView tv = (TextView)findViewById(R.id.team_a_score);
      tv.setText(String.valueOf(score));
  }
    public void DisplayForTeamB(int ScoreB){
        TextView v = (TextView)findViewById(R.id.team_b_score);
        v.setText(String.valueOf(ScoreB));
    }
}
