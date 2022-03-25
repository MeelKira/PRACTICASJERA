package com.example.practicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Tablasdemultiplicar extends AppCompatActivity {

    private EditText et1;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void ImpTabla(View v){
        String numero1 = et1.getText().toString();
        int numero2 = Integer.parseInt(numero1);
        String result2 = "";
        for(int i = 1; i <= 12; i++){
            int result1 = i * numero2;
            result2 += i+ " x " + numero1 + " = " + String.valueOf(result1) + '\n';
        }
        et2.setText(result2);
    }



    public void irAInicio2 (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
