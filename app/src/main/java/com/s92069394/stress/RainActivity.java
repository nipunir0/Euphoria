package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RainActivity extends AppCompatActivity {
    MediaPlayer player;
    Button btnmusicback;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain);
        btnmusicback=findViewById(R.id.musicbackbtn);

        btnmusicback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(RainActivity.this, MusicActivity.class));
            }
        });
    }
    public void play (View v){
        if (player==null){
            player=MediaPlayer.create(this, R.raw.rain);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) { stopplayer();}
            });
        }
        player.start();

    }
    public void pause (View V){
        if (player!=null){
            player.pause();
        }
    }
    public void stop (View v){
        stopplayer();
    }
    private void stopplayer(){
        if (player!=null){
            player.release();
            player=null;
            Toast.makeText(this ,"Music has Stopped! Click Play Button to play again ", Toast.LENGTH_SHORT).show();
        }
    }

}

