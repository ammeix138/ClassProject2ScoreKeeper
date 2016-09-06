package com.example.android.classproject2scorekeeper;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreBearcats = 0;

    int scoreMustangs = 0;

    int penaltiesBearcats = 0;

    int penaltiesMustangs = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}

    /**
     * Displays the given score for Team Bearcats.
     */
    public void displayForBearcats(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_bearcats_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Button command for plus 6 points for Team Bearcats (Touchdown Button).
     */

    public void addSixForBearcats(View v) {
        scoreBearcats = scoreBearcats + 6;
        displayForBearcats(scoreBearcats);
    }

    /**
     * Button command for plus 3 points for Team Bearcats (Field Goal Button).
     */

    public void addThreeForBearcats(View v) {
        scoreBearcats = scoreBearcats + 3;
        displayForBearcats(scoreBearcats);
    }

    /**
     * Button command for plus one point for Team Bearcats.(Extra Point Button)
     */

    public void addOneForBearcats(View v) {
        scoreBearcats = scoreBearcats + 1;
        displayForBearcats(scoreBearcats);
    }

    /**
     * Button command for plus 2 points for Team Bearcats. (Safety Button)
     */

    public void addTwoForBearcats(View v) {
        scoreBearcats = scoreBearcats + 2;
        displayForBearcats(scoreBearcats);
    }

    /**
     * Displays the given flag penalties for Team Bearcats.
     */

    public void displayPenaltiesBearcats(int penaltiesBearcats) {
        TextView scoreView = (TextView) findViewById(R.id.flag_penalties_bearcats);
        scoreView.setText(String.valueOf(penaltiesBearcats));
    }

    /**
     *Button command that adds 1 penalty flag to Team Bearcats
     */
    public void addOnePenaltyBearcats(View v) {
        penaltiesBearcats = penaltiesBearcats + 1;
        displayPenaltiesBearcats(penaltiesBearcats);
    }

    /**
     * Displays the given score for Team Mustangs.
     */
    public void displayForMustangs(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_mustang_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Button command that resets the score and resets flag penalty count for Team Bearcats and Mustangs.
     */

    public void resetAll(View v) {
        scoreBearcats = 0;
        scoreMustangs = 0;
        penaltiesBearcats = 0;
        penaltiesMustangs = 0;
        displayForBearcats(scoreBearcats);
        displayForMustangs(scoreMustangs);
        displayPenaltiesBearcats(penaltiesBearcats);
        displayPenaltiesForMustangs(penaltiesMustangs);
    }

    /**
     * Button command that adds 6 points to Team Mustangs (Touchdown Button).
     */

    public void addSixForMustangs(View v) {
        scoreMustangs = scoreMustangs + 6;
        displayForMustangs(scoreMustangs);
    }

    /**
     * Button command for plus 3 points for team Mustangs (Field Goal Button).
     */

    public void addThreeForMustangs(View v) {
        scoreMustangs = scoreMustangs + 3;
        displayForMustangs(scoreMustangs);
    }

    /**
     * Button command for plus 1 point for Team Mustangs.
     */

    public void addOneForMustangs(View v) {
        scoreMustangs = scoreMustangs + 1;
        displayForMustangs(scoreMustangs);
    }

    /**
     * Button command for plus 2 points for Team Bearcats. (Safety Button)
     */

    public void addTwoForMustangs(View v) {
        scoreMustangs = scoreMustangs + 2;
        displayForMustangs(scoreMustangs);
    }

    /**
     *Displays given penalty flags for team Mustangs.
     */
    public void displayPenaltiesForMustangs(int penaltiesMustangs) {
        TextView scoreView = (TextView) findViewById(R.id.flag_penalties_mustangs);
        scoreView.setText(String.valueOf(penaltiesMustangs));
    }

    /**
     * Button command that adds 1 penalty flag.
     *
     * @param v
     */

    public void addOnePenaltyMustangs(View v) {
        penaltiesMustangs = penaltiesMustangs + 1;
        displayPenaltiesForMustangs(penaltiesMustangs);
    }
}