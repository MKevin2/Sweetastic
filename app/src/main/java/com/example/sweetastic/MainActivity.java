package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.sweetastic.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void paraUsos(View view){
        Intent intent = new Intent(this, UsosActivity.class);
        startActivity(intent);
    }

    public void paraAspectos(View view){
        Intent intent = new Intent(this, AspectosActivity.class);
        startActivity(intent);
    }

}