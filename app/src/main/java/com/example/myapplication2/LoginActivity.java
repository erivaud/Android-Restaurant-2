package com.example.myapplication2;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void seConnecter(View view) {


        View inputLogin = findViewById(R.id.login);
        View inputPassword = findViewById(R.id.password);
        // View est la classe la plus haute des composants (tous les composants sont des views, même les layouts)
        // on peut donc caster
        EditText inputLoginET = (EditText) findViewById(R.id.login);
        EditText inputPasswordET = (EditText) findViewById(R.id.password);

        String loginString = inputLoginET.getText().toString();
        String passwordString = inputPasswordET.getText().toString();

        // Toast.makeText(this, loginString, Toast.LENGTH_LONG).show();
        // Toast.makeText(this, passwordString, Toast.LENGTH_LONG).show();

        if (loginString.equals("romy") && passwordString.equals("p")) {
            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);
            Toast.makeText(this, getString(R.string.connectOK) + loginString + " !", Toast.LENGTH_LONG).show();
        }



        else {
            Toast.makeText(this, getString(R.string.connectFailed), Toast.LENGTH_LONG).show();
        }


    }
}
