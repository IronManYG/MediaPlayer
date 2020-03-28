package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ad_duha);

        // Find the View that play mp3
        Button play = (Button) findViewById(R.id.play_button);

        // Set a click listener on that View
        play.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the play View is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.start(); // no need to call prepare(); create() does that for you
            }
        });

        // Find the View that pause mp3
        Button pause = (Button) findViewById(R.id.pause_button);

        // Set a click listener on that View
        pause.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pause View is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.pause(); // no need to call prepare(); create() does that for you
            }
        });

        // Find the View that test mp3
        Button test = (Button) findViewById(R.id.test_button);

        // Set a click listener on that View
        test.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pause View is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.seekTo(mediaPlayer.getDuration()/2); // no need to call prepare(); create() does that for you
            }
        });

        // Find the View that testTwo mp3
        Button testTwo = (Button) findViewById(R.id.test);

        // Set a click listener on that View
        testTwo.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pause View is clicked on.
            @Override
            public void onClick(View view) {
                mediaPlayer.seekTo(0); // no need to call prepare(); create() does that for you
            }
        });

    }
}
