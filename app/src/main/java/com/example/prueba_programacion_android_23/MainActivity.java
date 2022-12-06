package com.example.prueba_programacion_android_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private  ListView lvfarmacias;
    private ArrayList<Farmacia> Farmacias= new ArrayList<Farmacia>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void main(){
        lvfarmacias = (ListView) findViewById(R.id.lvFarmacias);
        ArrayAdapter<Farmacia> adapter = new ArrayAdapter<Farmacia>(this, R.layout.activity_farmacia, Farmacias);
        lvfarmacias.setAdapter(adapter);
    }

}