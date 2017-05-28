package com.example.projekt.nieruchomoci;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Start extends AppCompatActivity {

    private TabelaPytań tabelaPytań = new TabelaPytań();
    private TextView wyświetlPytanie;
    private EditText odp;
    private Button przycisk;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    private int mNumerPytania = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        wyświetlPytanie = (TextView) findViewById(R.id.pytanie);
        odp = (EditText) findViewById(R.id.odpowiedź);
        przycisk = (Button) findViewById(R.id.dalej);
        sharedPreferences = getSharedPreferences("nieruchomosc", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();


        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String domMieszkanie = null;
                String rynek = null;
              //  String agencja = null;
                if (mNumerPytania == 0) {
                    int wartosc = Integer.valueOf(odp.getText().toString());
                    // wartosc = odp.getText().toInt();
                    //editor.putString("wartosc", wartosc);
                    editor.putInt("wartosc", wartosc);
                    editor.commit();
                    updatePytanie();
                    odp.setText("");
                } else if (mNumerPytania == 1) {
                    //wkładWłasny = odp.getText().toString();
                   // editor.putString("wkładWłasny", wkładWłasny);
                    int wkładWłasny = Integer.valueOf(odp.getText().toString());
                    editor.putInt("wkładWłasny", wkładWłasny);
                    editor.commit();
                    updatePytanie();
                    odp.setText("");
                } else if (mNumerPytania == 2) {
                  //  mdm = odp.getText().toString();
                   // editor.putString("mdm", mdm);
                    int mdm = Integer.valueOf(odp.getText().toString());
                    editor.putInt("mdm", mdm);
                    editor.commit();
                    updatePytanie();
                    odp.setText("");
                } else if (mNumerPytania == 3) {
                 //   prowizja = odp.getText().toString();
                 //   editor.putString("kredyt", kredyt);
                    Float prowizja = Float.valueOf(odp.getText().toString());
                    editor.putFloat("prowizja", prowizja);
                    editor.commit();
                    updatePytanie();
                    odp.setText("");
                } else if (mNumerPytania == 4) {
                    domMieszkanie = odp.getText().toString();
                    editor.putString("domMieszkanie", domMieszkanie);
                    editor.commit();
                    updatePytanie();
                    odp.setText("");
                } else if (mNumerPytania == 5) {
                    rynek = odp.getText().toString();
                    editor.putString("rynek", rynek);
                    editor.commit();
                    updatePytanie();
                    odp.setText("");
                } else if (mNumerPytania == 6) {
                  //  agencja = odp.getText().toString();
                  //  editor.putString("agencja", agencja);
                    float agencja = Float.valueOf(odp.getText().toString());
                    editor.putFloat("agencja", agencja);
                    editor.commit();
                    odp.setText("");

                }

            }

        });


    }

    private void updatePytanie() {
        wyświetlPytanie.setText(tabelaPytań.getPytanie(mNumerPytania));
        mNumerPytania++;
    }

    public void powrót(View view) {
        Intent intent = new Intent(Start.this, MainActivity.class);
        startActivity(intent);
    }

    public void koniec(View view) {
        Intent intent = new Intent(Start.this, Koniec.class);
        startActivity(intent);
    }
}


