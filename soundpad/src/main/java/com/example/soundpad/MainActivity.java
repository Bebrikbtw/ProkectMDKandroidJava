package com.example.soundpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton img1, img2, img3;
    private MediaPlayer snd1, snd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.imageButton);
        img2 = findViewById(R.id.imageButton2);
        img3 = findViewById(R.id.imageButton3);
        snd1 = MediaPlayer.create(this,R.raw.amogus);
        snd2 = MediaPlayer.create(this,R.raw.sus);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snd1.stop();
                snd2.stop();
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sound(snd1);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sound(snd2);
            }
        });
    }
    private void Sound(MediaPlayer player){
        player.start();
    }
}