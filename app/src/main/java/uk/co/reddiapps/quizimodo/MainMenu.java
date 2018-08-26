package uk.co.reddiapps.quizimodo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button artButton = (Button)findViewById(R.id.topic_art_button);
    Button historyButton = (Button)findViewById(R.id.topic_history_button);
    Button geographyButton = (Button)findViewById(R.id.topic_geography_button);
    Button scienceButton = (Button)findViewById(R.id.topic_science_button);
    Button spaceButton = (Button)findViewById(R.id.topic_space_button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

    }

    public void buttonDown(){


    }
}
