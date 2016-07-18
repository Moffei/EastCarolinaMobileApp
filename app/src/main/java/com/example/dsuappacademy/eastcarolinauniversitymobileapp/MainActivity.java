package com.example.dsuappacademy.eastcarolinauniversitymobileapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void visitwebsite (View view){
        goToURL ("http://www.ecu.edu");
    }

    private void goToURL(String url) {

        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


    public void call (View view){
        String phone = "+3022682484";
        Intent callIntent = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phone,null));
        startActivity(callIntent);
    }


    }

