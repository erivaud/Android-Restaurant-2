package com.example.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication2.plats.Plat;

public class DetailPlatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_plat);

        Plat plat = (Plat)getIntent().getSerializableExtra("plat");

        Toast.makeText(this, plat.getLabel(), Toast.LENGTH_LONG).show();

        ImageView imageViewDetail = findViewById(R.id.plat_image);
        TextView textViewDetailTitle = findViewById(R.id.plat_titre);
        TextView textViewDetailDesc = findViewById(R.id.plat_description);
        TextView textViewDetailPrice = findViewById(R.id.plat_price);

        textViewDetailDesc.setText(plat.getDescription());
        textViewDetailTitle.setText(plat.getLabel());
        textViewDetailPrice.setText(plat.getPrix() + " €");

        int imageID = this.getResources().getIdentifier(plat.getImgUrl(), "drawable", this.getPackageName());
        imageViewDetail.setImageResource(imageID);

    }
}
