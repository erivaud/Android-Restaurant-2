package com.example.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.w("ETAT", "Create");
    }

    protected void onPause(){
        super.onPause();
        Log.w("ETAT", "Pause");

    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w("ETAT", "Destroy");

    }

    protected void onStart(){
        super.onStart();
        Log.w("ETAT", "Create");

    }
}
