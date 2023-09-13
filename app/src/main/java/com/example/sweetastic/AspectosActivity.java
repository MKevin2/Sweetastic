package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AspectosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aspectos);
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
    public void paraHist(View view) {
        Intent intent = new Intent(this, HistoriaActivity.class);
        startActivity(intent);
    }
}