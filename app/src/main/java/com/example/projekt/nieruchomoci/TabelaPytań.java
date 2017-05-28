package com.example.projekt.nieruchomoci;


public class TabelaPytań {
    private String mPytania [] = {
            "Jaką kwotę planujesz przeznaczyć na wkład własny?",
            "Czy udzielono Ci wsparcia z rządowego projektu MDM? Podaj kwotę (jeśli nie, wpisz: 0)",
            "Ile wynosi prowizja dla banku kredytującego? (jeśli nieruchomość nie jest kredytowana wpisz 0)",
            "Nieruchomość to dom czy mieszkanie?",
            "Nieruchomość pochodzi z rynku pierwotnego? tak/nie",
            "Czy agencja nieruchomości pobiera prowizje? (Wpisz jaką, wciśnij dalej, a następnie koniec)"
    };
    public String getPytanie(int a){
        String pytanie = mPytania[a];
        return pytanie;
    }
}
