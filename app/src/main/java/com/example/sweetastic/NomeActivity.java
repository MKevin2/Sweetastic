package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NomeActivity extends AppCompatActivity {

    public final static String NOME_USUARIO = "com.example.sweetastic.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nome);
    }

    public void enviarNome(View view) {
        Intent home = new Intent(this, MainActivity.class);
        EditText nome = (EditText)findViewById(R.id.txtNome);
        String msg = nome.getText().toString();
        home.putExtra(NOME_USUARIO, msg);
        startActivity(home);
    }
}