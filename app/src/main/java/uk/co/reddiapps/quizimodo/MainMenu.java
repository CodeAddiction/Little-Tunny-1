package uk.co.reddiapps.quizimodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button artButton;
    Button historyButton;
    Button geographyButton;
    Button scienceButton;
    Button spaceButton;
    Button randomButton;
    String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        artButton = findViewById(R.id.topic_art_button);
        historyButton = findViewById(R.id.topic_history_button);
        geographyButton = findViewById(R.id.topic_geography_button);
        scienceButton = findViewById(R.id.topic_science_button);
        spaceButton = findViewById(R.id.topic_space_button);
        randomButton = findViewById(R.id.topic_random_button);

        artButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent artIntent = new Intent(MainMenu.this, GameActivity.class);
                title = "Art";
                artIntent.putExtra("title", title);
                startActivity(artIntent);

            }
        });

        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainMenu.this, GameActivity.class);
                title = "History";
                artIntent.putExtra("title", title);
                startActivity(artIntent);
            }
        });

        geographyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainMenu.this, GameActivity.class);
                title = "Geography";
                artIntent.putExtra("title", title);
                startActivity(artIntent);
            }
        });

        scienceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainMenu.this, GameActivity.class);
                title = "Science";
                artIntent.putExtra("title", title);
                startActivity(artIntent);
            }
        });

        spaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainMenu.this, GameActivity.class);
                title = "Space";
                artIntent.putExtra("title", title);
                startActivity(artIntent);
            }
        });

        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artIntent = new Intent(MainMenu.this, GameActivity.class);
                title = "Random";
                artIntent.putExtra("title", title);
                startActivity(artIntent);
            }
        });
    }


}
