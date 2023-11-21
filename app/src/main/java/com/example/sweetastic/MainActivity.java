package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nomeText;
    static String mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent nomeUsu = getIntent();
        String msg = nomeUsu.getStringExtra(NomeActivity.NOME_USUARIO);
        mensagem = "Seja Bem Vindo(a), " + msg + "!";
        TextView nomeText = (TextView)findViewById(R.id.nomeText);
        nomeText.setText(mensagem);
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

    public void paraReciclagem(View view){
        Intent intent = new Intent(this, ReciclagemActivity.class);
        startActivity(intent);
    }

    public void paraSensor(View view){
        Intent intent = new Intent(this, SensorActivity.class);
        startActivity(intent);
    }

    public void JogosRecicla (View view){
        Uri uri = Uri.parse("https://wordwall.net/pt-br/community/reciclagem-de-pl%C3%A1stico");
        Intent Jogos = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(Jogos);
    }

}