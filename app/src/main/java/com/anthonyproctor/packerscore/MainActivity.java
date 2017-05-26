package com.anthonyproctor.packerscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.anthonyproctor.packerscore.R;

public class MainActivity extends AppCompatActivity {

    int packersScore = 0;
    int scoreOtherTeam = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPackers(0);
        displayForOtherTeam(0);
    }

    public void touchdownPackers(View v) {
         packersScore = packersScore + 7;
        displayForPackers(packersScore);
    }

    public void touchdownOtherTeam(View v) {
        scoreOtherTeam = scoreOtherTeam + 7;
        displayForOtherTeam(scoreOtherTeam);
    }

    public void fieldgoalPackers(View v) {
        packersScore = packersScore + 3;
        displayForPackers(packersScore);
    }

    public void fieldgoalOtherTeam(View v) {
        scoreOtherTeam = scoreOtherTeam + 3;
        displayForOtherTeam(scoreOtherTeam);
    }

    public void extraPointPackers(View v) {
        packersScore = packersScore + 1;
        displayForPackers(packersScore);
    }

    public void extraPointOtherTeam(View v) {
        scoreOtherTeam = scoreOtherTeam + 1;
        displayForOtherTeam(scoreOtherTeam);
    }

    public void safteyPackers(View v) {
        packersScore = packersScore + 2;
        displayForPackers(packersScore);
    }

    public void safetyPointOtherTeam(View v) {
        scoreOtherTeam = scoreOtherTeam + 2;
        displayForOtherTeam(scoreOtherTeam);
    }

    /**
     * Displays the given score for Packers.
     */
    public void displayForPackers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.packers_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Other Team.
     */
    public void displayForOtherTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.otherTeam_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        packersScore = 0;
        scoreOtherTeam = 0;
        displayForPackers(packersScore);
        displayForOtherTeam(scoreOtherTeam);
    }
}
