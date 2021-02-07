package com.example.sound;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ring = (Button) findViewById(R.id.ring);
        final MediaPlayer i = MediaPlayer.create(this,R.raw.beep);

        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i.start();
            }
        });
    }
}