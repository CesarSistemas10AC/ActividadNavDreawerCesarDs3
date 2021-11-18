package com.example.actividadnavdreawercesar;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;
import android.widget.MediaController;
public class plus extends AppCompatActivity {

    VideoView videoView;
    MediaController mediacontroller;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plus);

        videoView = (VideoView) findViewById(R.id.videoView);

        String path = "android.resource://"+getPackageName()+"/"+R.raw.peli;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();

        if(this.mediacontroller==null){
            this.mediacontroller = new MediaController(plus.this);
            this.mediacontroller.setAnchorView(videoView);
            this.videoView.setMediaController(mediacontroller);
        }

        this.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.seekTo(position);
                if(position==0){
                    videoView.start();
                }
                mp.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
                    @Override
                    public void onVideoSizeChanged(MediaPlayer mp, int width, int height) {
                        mediacontroller.setAnchorView(videoView);
                    }
                });
            }
        });
    }
}