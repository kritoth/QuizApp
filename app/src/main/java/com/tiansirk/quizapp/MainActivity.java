package com.tiansirk.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView gameOneView = findViewById(R.id.game_1);
        gameOneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameOne(gameOneView);
            }
        });

        final TextView gameTwoView = findViewById(R.id.game_2);
        gameOneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameTwo(gameTwoView);
            }
        });

        final TextView gameThreeView = findViewById(R.id.game_3);
        gameOneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameThree(gameThreeView);
            }
        });

        final TextView gameFourView = findViewById(R.id.game_4);
        gameOneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGameFour(gameFourView);
            }
        });
    }

    public void openGameOne(View view){
        Intent intent = new Intent(this, GameOneActivity.class);
        startActivity(intent);
    }

    public void openGameTwo(View view){
        Intent intent = new Intent(this, GameTwoActivity.class);
        startActivity(intent);
    }

    public void openGameThree(View view){
        Intent intent = new Intent(this, GameThreeActivity.class);
        startActivity(intent);
    }

    public void openGameFour(View view){
        Intent intent = new Intent(this, GameFourActivity.class);
        startActivity(intent);
    }
}
