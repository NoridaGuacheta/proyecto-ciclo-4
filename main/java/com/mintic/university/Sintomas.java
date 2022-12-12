package com.mintic.university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Sintomas extends AppCompatActivity {
    Button  btnEnviar,btnCancelar;
    ImageButton btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);

        btnEnviar=findViewById(R.id.buttonEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Sintomas.this, Profesor.class);
                startActivity(intent3);
            }
        });

        btnCancelar=findViewById(R.id.buttonCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Sintomas.this, MainActivity.class);
                startActivity(intent3);
            }
        });

        btnRegresar=findViewById(R.id.imageButtonRegre);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Sintomas.this, Ingreso.class);
                startActivity(intent3);
            }
        });

    }
}