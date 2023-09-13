package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class HistoriaActivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia);

        videoView = findViewById(R.id.video_view);
        String videopath = "android.resource://"+getPackageName()+"/"+R.raw.plastic;
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController( this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

    public void paraHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void paraUsos(View view){
        Intent intent = new Intent(this, UsosActivity.class);
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

    public void paraAspectos(View view){
        Intent intent = new Intent(this, AspectosActivity.class);
        startActivity(intent);
    }
}