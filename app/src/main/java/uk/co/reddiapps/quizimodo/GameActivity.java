package uk.co.reddiapps.quizimodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        title = findViewById(R.id.topic_title_tv);
        Intent intent = getIntent();
        String topic_title = intent.getStringExtra("title");
        title.setText(topic_title);

    }
}
