package com.example.practicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irABisiesto (View view){
        Intent i = new Intent(this, Bisiesto.class);
        startActivity(i);
    }

    public void irAPersonaje (View view){
        Intent i = new Intent(this, Personaje.class);
        startActivity(i);
    }

    public void irATablasDeMultiplicar (View view){
        Intent i = new Intent(this, Tablasdemultiplicar.class);
        startActivity(i);
    }

    public void irACalificaciones (View view){
        Intent i = new Intent(this, Calificaciones.class);
        startActivity(i);
    }



}