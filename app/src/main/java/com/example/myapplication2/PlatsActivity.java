package com.example.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication2.plats.Plat;

public class PlatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plats);

        ListView liste = findViewById(R.id.liste_plats);
        ExempleAdapter exempleAdapter = new ExempleAdapter(this, 0);

        Plat plat1 = new Plat("plat1", "Crevette Ananas", 15.50);
        Plat plat2 = new Plat("plat2", "Nems", 9.50);
        Plat plat3 = new Plat("plat3", "Soupe chinoise", 11.50);
        Plat plat4 = new Plat("plat4", "Ha Cao", 7.50);
        Plat plat5 = new Plat("plat5", "Raviolis chinois", 13.50);
        Plat plat6 = new Plat("plat6", "Riz aux légumes", 5.50);
        Plat plat7 = new Plat("plat7", "Poulet aux amandes", 18.50);

        exempleAdapter.add(plat1);
        exempleAdapter.add(plat2);
        exempleAdapter.add(plat3);
        exempleAdapter.add(plat4);
        exempleAdapter.add(plat5);
        exempleAdapter.add(plat6);
        exempleAdapter.add(plat7);

        liste.setAdapter(exempleAdapter);
    }
}
