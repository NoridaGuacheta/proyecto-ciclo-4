package com.mintic.university;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Cursos extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private TextView tvc;
    private ListView lvc;

    private final String nombres[] = {"Python","Java","Android","Ingles","Coaching"};
    private final String hora [] = {"7","9","11","1","3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);
        tvc =findViewById(R.id.textListaCursos);
        lvc =findViewById(R.id.listCursos);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_view_cursos,nombres);
        lvc.setAdapter(adapter);
        lvc.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        tvc.setText("Curso de "+lvc.getItemAtPosition(i)+ " programado para las "+ hora[i]);
    }
}