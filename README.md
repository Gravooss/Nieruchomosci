# Nieruchomości

Kalkulator środków potrzebnych do zabezpieczenia przed decyzją o kupnie nieruchomości.

## Autorzy projektu

|Imię i nazwisko   | numer indeksu  | grupa dziekańska  |
|------------------|----------------|-------------------|
|Adrian Janik      |186641          |KrDZIs3012Io       |
|Filip Jasiak      |186670          |KrDZIs3012Io       |

## Opis projektu
Aplikacja na kolejnych ekranach prosi o informacje od użytkownika odnośnie do planowanego zakupu nieruchomości (m.in. cena nieruchomości, koszty początkowe jeśli nieruchomość kredytowana, rynek wtórny/pierwotny, wkład własny MDM tak/nie, wkład własny ze środków własnych). Dzięki tym informacjom aplikacja oblicza kwotę środków potrzebnych do zabezpieczenia przed decyzją o kupnie nieruchomości. Uwzględnia podatek PCC (jeśli dotyczy rynku wtórnego), koszt wyceny nieruchomości ze strony banku (jeśli kwota kredytu powyżej 300 tysięcy PLN), taksę notarialną za sporządzenie aktu, taksę notarialną za ustanowienie hipoteki, opłata za odpis z Aktu Notarialnego, opłatę za wniosek o wpis hipoteki do KW (księga wieczysta), opłatę za wniosek o założenie KW jeśli nie istnieje, a zakup wiąże się z wyodrębnieniem lokalu z budynku, opłatę za wniosek o wpis/zmianę właściciela do KW, podatek od czynności cywilno-prawnych od ustanowienia hipoteki, prowizję dla biura nieruchomości jeśli jest po stronie nabywcy

## Użyta technologia

Projekt aplikacji powstał w programe Android Studio z wykorzystaniem bibliotek SDK Android, do łączenia z internetem została dodana biblioteka Jsoup. Do zapisywania danych klienta posłużył SharedPreferences.

## Opis funkcjonalności

Po zainstalowaniu aplikacji użytkownik dzięki intuicyjnej miniaturze włącza aplikację. Jego oczom ukazuje się miłe powitanie oraz ekran z trzema możliwymi aktywnościami. Przycisk "Start" skieruje go na drogę ku ostatecznemu wyjaśnieniu kwestii ilości potrzebnego kapitału przeznaczonego na koszty wstępne przed zakupem nieruchomości. Drugi przycisk oznaczony jako "O APLIKACJI" umożliwia użytkownikowi zapoznanie się z sylwetkami autorów oraz krótkim opisem aplikacji. Trzecia aktywność to "WALUTY", użytkownik może zapoznać się z obecnym kursem waluty jaką podaje strona bankier.pl.



## Wygląd aplikacji

![18765124_1977044962524721_1728506276_o](https://cloud.githubusercontent.com/assets/29023147/26532113/33886da6-43f9-11e7-9a3d-23316969430f.png)
![18765170_1977044972524720_430482130_o](https://cloud.githubusercontent.com/assets/29023147/26532136/8b47af98-43f9-11e7-97af-64a1fd013a03.png)
![18767073_1977044949191389_1246619238_o](https://cloud.githubusercontent.com/assets/29023147/26532139/8e12a23c-43f9-11e7-812e-2f77f0f32ed6.png)
![18789021_1977044945858056_1806496149_o](https://cloud.githubusercontent.com/assets/29023147/26532140/90ab7186-43f9-11e7-9aeb-34640d50d6bf.png)
![18789804_1977044952524722_1764057642_o](https://cloud.githubusercontent.com/assets/29023147/26532141/91b3d654-43f9-11e7-9b70-e1af9ee15d13.png)
