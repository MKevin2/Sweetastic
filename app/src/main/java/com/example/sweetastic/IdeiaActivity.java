package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class IdeiaActivity extends AppCompatActivity {
    VideoView videoView2;
    VideoView videoView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ideia);

        videoView2 = findViewById(R.id.video_view2);
        String videopath2 = "android.resource://"+getPackageName()+"/"+R.raw.video1;
        Uri uri2 = Uri.parse(videopath2);
        videoView2.setVideoURI(uri2);

        MediaController mediaController2 = new MediaController( this);
        videoView2.setMediaController(mediaController2);
        mediaController2.setAnchorView(videoView2);

        videoView3 = findViewById(R.id.video_view3);
        String videopath3 = "android.resource://"+getPackageName()+"/"+R.raw.video2;
        Uri uri3 = Uri.parse(videopath3);
        videoView3.setVideoURI(uri3);

        MediaController mediaController3 = new MediaController( this);
        videoView3.setMediaController(mediaController3);
        mediaController3.setAnchorView(videoView3);
    }

    public void paraHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void paraAspectos(View view){
        Intent intent = new Intent(this, AspectosActivity.class);
        startActivity(intent);
    }

    public void paraPontos(View view){
        Intent intent = new Intent(this, PontosActivity.class);
        startActivity(intent);
    }
    public void paraReciclagem(View view) {
        Intent intent = new Intent(this, ReciclagemActivity.class);
        startActivity(intent);
    }

    public void paraUsos(View view){
        Intent intent = new Intent(this, UsosActivity.class);
        startActivity(intent);
    }
}