package com.example.myapplication2;


import com.example.myapplication2.avis.Avis;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;

public class Util {

    public static Avis[] get(URL url) throws IOException {

        Gson gson = new Gson();

        URLConnection connection = url.openConnection();
        InputStream inputStream = connection.getInputStream();
        Reader reader = new InputStreamReader(inputStream);
        return gson.fromJson(reader, Avis[].class);

    }
}
