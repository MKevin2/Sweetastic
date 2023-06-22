package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static String mensagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent nomeUsu = getIntent();
        String msg = nomeUsu.getStringExtra(NomeActivity.NOME_USUARIO);
        mensagem = "Seja bem vindo, " + msg + "!";
        TextView nomeText = (TextView)findViewById(R.id.nome_text);
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
}