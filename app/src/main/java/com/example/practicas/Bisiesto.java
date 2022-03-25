package com.example.practicas;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import androidx.appcompat.app.AppCompatActivity;
public class Bisiesto extends MainActivity {

    EditText Anio;

    Button Verificar;

    TextView respuesta;

    AlertDialog.Builder dialogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Anio = (EditText) findViewById(R.id.edtxtAnio);
        Verificar = (Button) findViewById(R.id.btnVerificar);
        respuesta = (TextView) findViewById(R.id.resultado);

        Verificar.setOnClickListener(v -> {
            if(Verificar.getText().toString().equals("Limpiar")){
                Anio.setText("");
                respuesta.setText("");
                Anio.setEnabled(true);
                Anio.requestFocus();
                Verificar.setText("Verificar");
            }else{
                if(Anio.getText().length() == 0){
                    dialogo = new AlertDialog.Builder(Bisiesto.this);
                    dialogo.setTitle("Error");
                    dialogo.setMessage("Debe ingresar el cociente 'año'");
                    dialogo.setCancelable(false);
                    dialogo.setPositiveButton("Cerrar", (dialogo, id) -> {
                        dialogo.cancel();
                        Anio.setText("");
                        Anio.requestFocus();
                    });
                    dialogo.show();
                }else{
                    int anio = Integer.parseInt(Anio.getText().toString());
                    if(anio % 4 == 0  &&  (anio % 100 != 0  ||  anio % 400 == 0)){
                        respuesta.setText("El año " + Anio.getText() + " es bisiesto");
                    }else{
                        respuesta.setText("El año " + Anio.getText() + " no es bisiesto");
                    }
                }
                Anio.setEnabled(false);
                Verificar.setText("Limpiar");
            }
        });
    }

    public void irAInicio (View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}