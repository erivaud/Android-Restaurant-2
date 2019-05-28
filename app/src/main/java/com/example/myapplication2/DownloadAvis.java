package com.example.myapplication2;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.myapplication2.avis.Avis;

import java.io.IOException;
import java.net.URL;

public class DownloadAvis extends AsyncTask<URL, Integer, Avis[]> {

    private DisplayAvis activity;
    public DownloadAvis (DisplayAvis activity) {
        this.activity = activity;
    }

    @Override
    protected Avis[] doInBackground(URL... urls) {
        try {
            publishProgress(10);
            Avis[] result = Util.get(urls[0]);
            publishProgress(90);
            return result;
        } catch (IOException e) {
            return new Avis[0];
        }
    }

    protected void onPostExecute(Avis[] avis) {
        TextView txt = activity.findViewById(R.id.avisstatus);
        txt.setVisibility(View.VISIBLE);
        ProgressBar progress = activity.findViewById(R.id.avisProgressBar);
        progress.setVisibility(View.INVISIBLE);
        txt.setText("J'ai "+avis.length+" avis");
    }
}
