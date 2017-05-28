package com.example.projekt.nieruchomoci;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Koniec extends AppCompatActivity {

    private TextView test;

    private TextView test2;

    private TextView test3;

    private TextView test4;

    private TextView test5;

    private TextView test7;

    private TextView test8;

    private TextView test9;

    private TextView test10;

    private TextView test11;

    private TextView test12;

    private TextView test13;

    int rodzajNiercuhomosci, hKW, wHKW, wNw, pCp ;

    float pcc2, uP, calosc, prowizja, prowizjaa, umDeweloperska, agencja1, zalKW, ccalosc;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koniec);
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(this);
        sharedPreferences = getSharedPreferences("nieruchomosc", Context.MODE_PRIVATE);
        test = (TextView) findViewById(R.id.textView);

        test2 = (TextView) findViewById(R.id.textView2);

        test3 = (TextView) findViewById(R.id.textView3);

        test4 = (TextView) findViewById(R.id.textView4);

        test5 = (TextView) findViewById(R.id.textView5);

        test7 = (TextView) findViewById(R.id.textView7);

        test8 = (TextView) findViewById(R.id.textView8);

        test9 = (TextView) findViewById(R.id.textView9);

        test10 = (TextView) findViewById(R.id.textView10);

        test11 = (TextView) findViewById(R.id.textView11);

        test12 = (TextView) findViewById(R.id.textView12);

        test13 = (TextView) findViewById(R.id.textView13);


        int wartosc = sharedPreferences.getInt("wartosc", 0);
        test.setText("Wartość nieruchomości: " + wartosc);

        int wklad = sharedPreferences.getInt("wkładWłasny", 0);
        test2.setText("Wkład własny: " + wklad);

        int mdm = sharedPreferences.getInt("mdm", 0);
        test3.setText("Wartość MDM: " + mdm);

        prowizja = sharedPreferences.getFloat("prowizja", 0);

        test5.setText("Rodzaj nieruchomości: " + sharedPreferences.getString("domMieszkanie", ""));

        test7.setText("Nieruchomość pochodzi z rynku pierwotnego: " + sharedPreferences.getString("rynek", ""));

        float agencja = sharedPreferences.getFloat("agencja", 0);
        test8.setText("Prowizja agencji: " + agencja * wartosc);

        if (test5.getText().toString().equals("Rodzaj nieruchomości: dom")) {
            rodzajNiercuhomosci = 700;
        } else {
            rodzajNiercuhomosci = 400;
        }
        if (test7.getText().toString().equals("Nieruchomość pochodzi z rynku pierwotnego: nie")) {
            pcc2 = (float) 0.02;
            zalKW = 0;
            if (wartosc < 30000) {

                uP = (float) (310 + (0.02 * wartosc));

            } else if (wartosc > 30000 && wartosc < 60000) {

                uP = (float) (710 + (0.02 * wartosc));

            } else if (wartosc > 60000 && wartosc < 1000000) {

                uP = (float) (1010 + (0.004 * wartosc));

            } else if (wartosc > 1000000 && wartosc < 2000000) {

                uP = (float) (4770 + (0.002 * wartosc));

            } else {

                uP = (float) (6770 + (0.0025 * wartosc));

            }
            umDeweloperska = 0;
        } else {
            pcc2 = 0;
            zalKW = 60;
            if (wartosc < 30000) {

                uP = (float) (310 + (0.02 * wartosc));

            } else if (wartosc > 30000 && wartosc < 60000) {

                uP = (float) (710 + (0.02 * wartosc));

            } else if (wartosc > 60000 && wartosc < 1000000) {

                uP = (float) (1010 + (0.004 * wartosc));

            } else if (wartosc > 1000000 && wartosc < 2000000) {

                uP = (float) (4770 + (0.002 * wartosc));

            } else {

                uP = (float) (6770 + (0.0025 * wartosc));

            }
            umDeweloperska = (float) 0.5 * uP;
            ;
        }
        test9.setText("Koszt wyceny: " + rodzajNiercuhomosci);
        float pcc = pcc2 * wartosc;
        test10.setText("pcc2= " + pcc);
        test11.setText("Max koszt umowy deweloperskiej: " + umDeweloperska);

        hKW = 200;
        wHKW = 200;
        wNw = 200;
        pCp = 19;


        calosc = wartosc - wklad - mdm;


        if (calosc > 0) {
            if (agencja != 0) {
                agencja1 = wartosc * agencja;
            }

            if (prowizja != 0) {
                prowizjaa = prowizja * calosc;
            } else {
                prowizjaa = 0;
            }

            if (wklad == wartosc) {
                ccalosc = wHKW + wNw + pCp + hKW + zalKW + pcc + umDeweloperska + uP + prowizjaa + agencja1;
            } else {
                ccalosc = wHKW + wNw + pCp + hKW + zalKW + pcc + umDeweloperska + uP + prowizjaa + agencja1 + rodzajNiercuhomosci;
            }

            test4.setText("Prowizja banku: " + prowizjaa);
            test13.setText("umowa przenosząca: " + uP);
            test12.setText("calosc: " + ccalosc);


        } else {
            if (agencja != 0) {
                agencja1 = wartosc * agencja;
            }

            prowizjaa = 0;


            if (wklad == wartosc) {
                ccalosc = wHKW + wNw + pCp + hKW + zalKW + pcc2 + umDeweloperska + uP + prowizjaa + agencja1;
            } else {
                ccalosc = wHKW + wNw + pCp + hKW + zalKW + pcc2 + umDeweloperska + uP + prowizjaa + agencja1 + rodzajNiercuhomosci;

            }
            test4.setText("Prowizja banku: " + prowizjaa);
            test13.setText("Umowa przenosząca: " + uP);
            test12.setText("Calosc: " + ccalosc );

            }
    }

    }




