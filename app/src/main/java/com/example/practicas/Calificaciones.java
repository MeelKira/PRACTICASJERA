package com.example.practicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Calificaciones extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private TextView tvresult;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificaciones);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        et5=(EditText)findViewById(R.id.et5);
        tvresult= (TextView) findViewById(R.id.tv_resultado);
    }

    public void calcular (View view){
        String Materia1_String = et1.getText().toString();
        String Materia2_String = et1.getText().toString();
        String Materia3_String = et1.getText().toString();
        String Materia4_String = et1.getText().toString();
        String Materia5_String = et1.getText().toString();

        double Materia1_double = Double.parseDouble(Materia1_String);
        double Materia2_double = Double.parseDouble(Materia2_String);
        double Materia3_double = Double.parseDouble(Materia3_String);
        double Materia4_double = Double.parseDouble(Materia4_String);
        double Materia5_double = Double.parseDouble(Materia5_String);

        double promedio = (Materia1_double+Materia2_double+Materia3_double+Materia4_double+Materia5_double)/5;

        if (promedio>60){
            tvresult.setText("APROBADO!!!!" +promedio);
        } else if(promedio<59){
            tvresult.setText("REPROBADO!!!" +promedio);
        }

    }

    public void irAInicio3 (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}




