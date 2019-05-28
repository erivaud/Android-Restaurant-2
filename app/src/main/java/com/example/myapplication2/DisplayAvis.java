package com.example.myapplication2;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.net.MalformedURLException;
import java.net.URL;

public class DisplayAvis extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avis);

        try {
            URL url = null;
            url = new URL("http://formation-pro.eu:8080/avis");
            new DownloadAvis(this)
                    .executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
