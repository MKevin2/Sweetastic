package com.example.sweetastic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NomeActivity extends AppCompatActivity {
    TextView nomeText;
    static String mensagem;
    public final static String NOME_USUARIO = "com.example.sweetastic.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nome);
    }

    public void enviarNome(View view) {
            Intent main = new Intent(this, MainActivity.class);
            EditText nome = (EditText) findViewById(R.id.txtNome);
            String msg = nome.getText().toString();
            main.putExtra(NOME_USUARIO, msg);
            startActivity(main);

        if(!NOME_USUARIO.isEmpty()){
            Toast.makeText(getApplicationContext(), "Aproveite o Aplicativo!", Toast.LENGTH_SHORT).show();
        }
    }
}