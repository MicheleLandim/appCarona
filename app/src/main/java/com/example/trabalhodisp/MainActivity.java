package com.example.trabalhodisp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import dominio.dao.UsuarioDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void irTelaMotorista(View view){
        Intent intent = new Intent(this, telaMotorista.class);
        startActivity(intent);
    }

    public void irTelaCadastro(View view){
        Intent intent = new Intent(this, telaCadastro.class);
        startActivity(intent);
    }

    public void irTelaPassageiro(View view){
        Intent intent = new Intent(this, telaPassageiro.class);
        startActivity(intent);
    }

    public void irTelaEsqueciSenha(View view){
        Intent intent = new Intent(this, telaEsqueciSenha.class);
        startActivity(intent);
    }


    public bool validarLogin()
    {
        UsuarioDao usuarioDao = new UsuarioDao();
        String email = "";
        String senha = "";


    }
}