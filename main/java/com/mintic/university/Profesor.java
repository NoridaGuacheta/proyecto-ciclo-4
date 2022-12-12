package com.mintic.university;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profesor extends AppCompatActivity {
    Button cursos,estudiantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesor);

       cursos=findViewById(R.id.buttonCursos);
       cursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Profesor.this, Cursos.class);
                startActivity(intent5);
            }
        });

        estudiantes=findViewById(R.id.buttonEstudiantes);
        estudiantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Profesor.this, ListaEstudiantes.class);
                startActivity(intent5);
            }
        });
    }
}


