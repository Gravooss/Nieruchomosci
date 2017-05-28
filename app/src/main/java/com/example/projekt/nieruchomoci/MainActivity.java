package com.example.projekt.nieruchomoci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Intent intent = new Intent (MainActivity.this, Start.class);
        startActivity(intent);
    }

    public void Waluty(View view) {
        Intent intent = new Intent (MainActivity.this, Opcje.class);
        startActivity(intent);
    }

    public void autorzy(View view) {
        Intent intent = new Intent (MainActivity.this, Autorzy.class);
        startActivity(intent);
    }
}
