package com.example.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication2.plats.Plat;

public class PlatsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plats);

        ListView liste = findViewById(R.id.liste_plats);
        ExempleAdapter exempleAdapter = new ExempleAdapter(this, 0);

        Plat plat1 = new Plat("plat1", "Crevette Ananas", "Description", 15.50);
        Plat plat2 = new Plat("plat2", "Nems", "Description",9.50);
        Plat plat3 = new Plat("plat3", "Soupe chinoise", "Description",11.50);
        Plat plat4 = new Plat("plat4", "Ha Cao", "Description",7.50);
        Plat plat5 = new Plat("plat5", "Raviolis chinois", "Description",13.50);
        Plat plat6 = new Plat("plat6", "Riz aux légumes", "Description",5.50);
        Plat plat7 = new Plat("plat7", "Poulet aux amandes", "Description",18.50);

        exempleAdapter.add(plat1);
        exempleAdapter.add(plat2);
        exempleAdapter.add(plat3);
        exempleAdapter.add(plat4);
        exempleAdapter.add(plat5);
        exempleAdapter.add(plat6);
        exempleAdapter.add(plat7);

        liste.setAdapter(exempleAdapter);

        liste.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        ListView listPlats = (ListView)parent;
        // La liste des plats
        Plat platSelectionne = (Plat)listPlats.getAdapter().getItem(position);
       // ici on récupère celui qui est cliqué
        Intent intent = new Intent(this, DetailPlatActivity.class);
        intent.putExtra("plat", platSelectionne);
        // ici on donne à notre intent une information à passer à une autre activité

        startActivity(intent);

    }
}
