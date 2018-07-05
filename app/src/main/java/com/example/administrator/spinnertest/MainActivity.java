package com.example.administrator.spinnertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    Spinner sp;
    ArrayList<coloritem> coloritems;
    ArrayAdapter<CharSequence> data;
    SpinnerAdapter spinnerAdapter;
//    ArrayList<String> color_tickets;
//    String[] color_names, color_codes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> data = ArrayAdapter.createFromResource(
        this, R.array.color, android.R.layout.simple_spinner_item );
        sp.setAdapter(data);

        coloritems = new ArrayList<coloritem>();
        coloritems.add(new coloritem("紫色","#a040ff"));
        coloritems.add(new coloritem("藍色","#76d5f2"));
        coloritems.add(new coloritem("綠色","#6fefa2"));
        spinnerAdapter = new SpinnerApapter(this,coloritems);
        sp.setAdapter(spinnerAdapter);
    }
}
