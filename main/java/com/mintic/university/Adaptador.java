package com.mintic.university;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    private Context context;
    private int layout;
    private ArrayList<String> names;

    public Adaptador(Context context1, int layout1, ArrayList<String> names1){
        this.context= context1;
        this.layout=layout1;
        this.names=names1;

    }


    @Override
    public int getCount() {
        return this.names.size();
    }

    @Override
    public Object getItem(int i) {
        return this.names.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View v= convertView;
        LayoutInflater layoutInflater= LayoutInflater.from(this.context);
        v=layoutInflater.inflate(R.layout.activity_lista_estudiantes, null);



        String currentName= names.get(i);
        TextView textView= v.findViewById(R.id.textViewE);
        textView.setText(currentName);
        return v;
    }
}
