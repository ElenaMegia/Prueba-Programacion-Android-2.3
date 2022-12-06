package com.example.prueba_programacion_android_23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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
        Farmacia f1=new Farmacia(1243, "Farmacia1", "2345");
        Farmacias.add(f1);
        lvfarmacias = (ListView) findViewById(R.id.lvFarmacias);

        MyAdapter myAdapter = new MyAdapter(this, R.layout.activity_farmacia, Farmacias);
        lvfarmacias.setAdapter(myAdapter);
        lvfarmacias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Has pulsado: "+ Farmacias.get(position), Toast.LENGTH_LONG).show();
            }
        });


    }



}