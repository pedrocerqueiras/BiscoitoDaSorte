package com.example.biscoitodasorte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase (View view){

        String[] frases = {
                "O que você procura está procurando você.",
                "Tente mover o mundo - o primeiro passo será mover a si mesmo.",
                "Se você não vivenciar o fracasso, não saberá reconhecer quando o sucesso realmente chegar.",
                "Uma longa viagem começa com um único passo.",
                "Você precisa fazer aquilo que pensa que não é capaz de fazer.",
                "Quem quer colher rosas deve suportar os espinhos.",
                "Busque multiplicar sorrisos e subtrair tristezas em todos os dias da sua vida.",
                "A chave do sucesso é começar antes de estar pronto.",
                "Não tenha medo de desistir do que é bom para ir atrás do que é ótimo.",
                "Você não é uma gota no oceano, você é o oceano inteiro dentro de uma gota."
        };


        int numero = new Random().nextInt(10);
        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);


    }



}