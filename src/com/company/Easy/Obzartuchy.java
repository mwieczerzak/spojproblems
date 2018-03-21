package com.company.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * GLUTTON - Obżartuchy
 * Co roku w Megabajtolandii odbywa się Zlot Obżartuchów. Podczas każdego zlotu tradycją jest,
 * że pierwszego dnia wszyscy uczestnicy obżerają się ciastkami przez całą dobę non-stop,
 * nie mając ani ułamka sekundy przerwy. Jak tylko obżartuch skończy jeść jedno ciastko
 * to od razu musi zabrać się za następne (nie dotyczy to sytuacji pod koniec doby,
 * kiedy to uczestnikowi nie wolno napocząć ciastka jeśli wie, że nie zdąży go zjeść przed końcem doby).
 * Kolejnym ważnym elementem tradycji jest to, że każdy obżartuch je każde swoje ciastko w niezmiennym przez całą dobę,
 * charakterystycznym dla siebie tempie.
 * <p>
 * Na najbliższy Zlot zostały zaproszone tylko te obżartuchy, które już uczestniczyły w poprzednich Zlotach.
 * Dzięki temu wiadomo z góry w jakim tempie każdy z nich je ciastka
 * (obżartuchy nie lubią zmieniać swojego wyuczonego tempa). Na podstawie tych danych,
 * organizatorzy Zlotu chcą określić ile należy kupić ciastek. Sytuację utrudnia fakt,
 * że ciastka w sklepie sprzedawane są w pudełkach o stałej wielkości, a nie na sztuki
 * - przez to być może trzeba będzie kupić trochę więcej ciastek niż zostanie zjedzonych.
 * <p>
 * Zadanie
 * Mając daną liczbę obżartuchów zaproszonych na Zlot oraz czas jedzenia pojedynczego ciastka
 * (podany w sekundach) przez każdego z nich Twój program powinien policzyć ile należy kupić pudełek z ciastkami.
 * <p>
 * Specyfikacja wejścia
 * W pierwszej linii wejścia znajduje się jedna dodatnia liczba całkowita,
 * oznaczająca liczbę zestawów testowych, które dalej pojawią się na wejściu.
 * Każdy zestaw ma następującą postać. W pierwszej linii znajdują się dwie
 * liczby całkowite N i M oddzielone pojedynczą spacją (1 ≤ N ≤ 10.000, 1 ≤ M ≤ 1.000.000.000).
 * Oznaczają one odpowiednio liczbę zaproszonych obżartuchów na Zlot oraz liczbę ciastek w jednym pudełku.
 * Kolejne N wierszy zestawu zawiera po jednej liczbie całkowitej dodatniej niewiększej niż 100.000.
 * Są to czasy (w sekundach) jedzenia pojedynczego ciastka przez kolejnych obżartuchów.
 * <p>
 * Specyfikacja wyjścia
 * Dla każdego zestawu danych pojawiającego się na wejściu należy wypisać
 * dokładnie jedną liczbę całkowitą (każdą w osobnej linii), oznaczającą liczbę pudełek z ciastkami,
 * jaką organizatorzy muszą kupić na Zlot.
 * <p>
 * Przykład
 * <p>
 * Wejście
 * 2
 * 2 10
 * 3600
 * 1800
 * 3 356
 * 123
 * 32999
 * 10101
 * <p>
 * Wyjście
 * 8
 * 2
 */

public class Obzartuchy {

    public static void main(String[] args) throws java.lang.Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int liczbaTestow = Integer.parseInt(r.readLine());
        int liczbaObzartuchow;
        int liczbaCiastekWPudelku;
        String s;
        for (int i = 0; i < liczbaTestow; i++) {
            s = r.readLine();
            String[] ss = s.split(" ");
            liczbaObzartuchow = Integer.parseInt(ss[0]);
            liczbaCiastekWPudelku = Integer.parseInt(ss[1]);
            if (liczbaObzartuchow >= 1 && liczbaObzartuchow <= 10000 && liczbaCiastekWPudelku >= 1 && liczbaCiastekWPudelku <= 1000000000) ;
            int iloscCiastek = 0;
            int iloscPudelek;
            for (int j = 0; j < liczbaObzartuchow; j++) {
                double sekundy = Double.parseDouble(r.readLine());
                if (sekundy <= 100000) {
                    double suma = 86400 / sekundy;
                    iloscCiastek += suma;
                }
            }
            if (iloscCiastek % liczbaCiastekWPudelku == 0) {
                iloscPudelek = iloscCiastek / liczbaCiastekWPudelku;
            } else {
                iloscPudelek = (iloscCiastek / liczbaCiastekWPudelku) + 1;
            }
            System.out.println(iloscPudelek);
        }
    }
}
