package com.example.projekt.nieruchomoci;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.projekt.nieruchomoci.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Opcje extends AppCompatActivity {
    String url = "http://www.bankier.pl/waluty";

    Button przycisk1;

    Button przycisk2;

    TextView test15;

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcje);

        przycisk1 = (Button)findViewById(R.id.button);

        przycisk2 = (Button)findViewById(R.id.button2);

        test15 = (TextView) findViewById(R.id.textView15);

        przycisk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new USD().execute();
            }


        });
        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new EUR().execute();
            }


        });

    }

    private class EUR extends AsyncTask<Void,Void,Void> {

        String waluta;
        String wartosc;
        @Override
        protected void onPreExecute(){
            // super.onPreExecute();;
            progressDialog = new ProgressDialog(Opcje.this);
            progressDialog.setTitle("Waluta");
            progressDialog.setMessage("Ładuje....");
            progressDialog.setIndeterminate(false);
            progressDialog.show();


        }
        @Override
        protected Void doInBackground(Void... params) {
            try {

                org.jsoup.nodes.Document document =  Jsoup.connect(url).get();

                Element table = document.select("table").get(4);
                Element td = table.select("td").get(1);
                waluta = td.text();
                Element td1 = table.select("td").get(0);
                wartosc = td1.text();


            }catch (IOException ex){
                ex.printStackTrace();
            }

            return null;
        }
        @Override
        protected void onPostExecute(Void aVoid){
            // super.onPostExecute();
            test15.setText("Aktualna wartość waluty: 1 "+wartosc+ " = " + waluta + " PLN");
            progressDialog.dismiss();
        }
    }
    private class USD extends AsyncTask<Void,Void,Void> {

        String waluta;
        String wartosc;
        @Override
        protected void onPreExecute(){
            // super.onPreExecute();;
            progressDialog = new ProgressDialog(Opcje.this);
            progressDialog.setTitle("Autor");
            progressDialog.setMessage("Laduje....");
            progressDialog.setIndeterminate(false);
            progressDialog.show();


        }
        @Override
        protected Void doInBackground(Void... params) {
            try {

                org.jsoup.nodes.Document document =  Jsoup.connect(url).get();

                Element table = document.select("table").get(4);
                Element td = table.select("td").get(4);
                waluta = td.text();
                Element td1 = table.select("td").get(3);
                wartosc = td1.text();


            }catch (IOException ex){
                ex.printStackTrace();
            }

            return null;
        }
        @Override
        protected void onPostExecute(Void aVoid){
            // super.onPostExecute();
            test15.setText("Aktualna wartość waluty: 1 "+wartosc+ " = " + waluta + " PLN");
            progressDialog.dismiss();
        }
    }

}