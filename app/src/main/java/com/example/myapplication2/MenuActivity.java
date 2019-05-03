package com.example.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void choiceDone(View view) {
        if (view.getId() == R.id.avis_menu) {
            Intent intent = new Intent(this, AvisActivity.class);
            startActivity(intent);

        } else if (view.getId() == R.id.geolocalisation_menu) {
            Intent intent = new Intent(this, MapActivity.class);
            startActivity(intent);

        } else if (view.getId() == R.id.plats_menu) {
            Intent intent = new Intent(this, PlatsActivity.class);
            startActivity(intent);

        } else if (view.getId() == R.id.uploadpicture_menu) {
            Intent intent = new Intent(this, UploadActivity.class);
            startActivity(intent);
        }
    }
}
