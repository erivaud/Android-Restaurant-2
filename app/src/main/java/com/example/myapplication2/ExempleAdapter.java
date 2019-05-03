package com.example.myapplication2;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication2.plats.Plat;

public class ExempleAdapter extends ArrayAdapter<Plat> {


    public ExempleAdapter(Context context, int resource) {
        super(context, resource);

    }

   // public View getView(int position, View convertView, ViewGroup parent) {
    //    Button but = new Button(this.getContext());
     //   Object item = this.getItem(position);
    //    but.setText("Bonjour " + position + " " + item.toString());
   //     return but;
  //  }

    public View getView(int position, View convertView,ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(this.getContext());
        View view = inflater.inflate(R.layout.plat_item, null);

        Plat data = this.getItem(position);
        TextView textViewText = view.findViewById(R.id.item_text);
        textViewText.setText(data.getLabel());

        return view;
    }

}