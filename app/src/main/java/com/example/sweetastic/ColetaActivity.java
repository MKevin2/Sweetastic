package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ColetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coleta);
    }

    public void paraUsos(View view){
        Intent intent = new Intent(this, UsosActivity.class);
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
    public void paraHome(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void paraReciclagem(View view) {
        Intent intent = new Intent(this, ReciclagemActivity.class);
        startActivity(intent);
    }

    public void Pesquisar (View view){
        Intent Pesquisar = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = "Pontos de Coleta de Lixo Perto de Mim";
        Pesquisar.putExtra(SearchManager.QUERY,query);
        startActivity(Pesquisar);
    }

    public void PesquisarMap (View view){
        Uri location = Uri.parse("geo:-23.598288,-46.628284?z=14");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        startActivity(mapIntent);
    }
}