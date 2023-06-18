package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class UsosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usos);
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
}