package com.s92069394.stress;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class AsmrActivity extends AppCompatActivity {
    Button videoback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmractivity);
        videoback=findViewById(R.id.buttonvideoback);

        VideoView videoView=findViewById(R.id.video);
        String videopath ="android.resource://"+getPackageName()+"/"+R.raw.sleepandrelaxion;
        Uri uri= Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController= new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        videoback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(AsmrActivity.this, VideoActivity.class));
            }
        });
    }
}