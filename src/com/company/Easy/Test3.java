package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * PP0601A2 - Test 3
 * Przepisz dane z wejścia na wyjście. Dane wejściowe są dwucyfrowymi liczbami naturalnymi.
 * Zakończ działanie programu, gdy na wejściu pojawi się,
 * trzecia liczba 42 poprzedzona jakąkolwiek inną liczbą, różną od 42.
 * <p>
 * Wejście
 * W każdej linii jedna liczba dwucyfrowa.
 * <p>
 * Wyjście
 * W każdej linii jedna liczba dwucyfrowa. Odczytane wartości 42 również powinny się pojawić.
 * <p>
 * Przykład
 * Wejście:
 * 42
 * 42
 * 12
 * 13
 * 42
 * 11
 * 42
 * 43
 * 42
 * 42
 * 99
 * 01
 * Wyjście:
 * 42
 * 42
 * 12
 * 13
 * 42
 * 11
 * 42
 * 43
 * 42
 */
public class Test3 {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int zmienna = 0;
        int stala = 42;
        while (true) {
            int wejscie = stala;
            stala = Integer.parseInt(r.readLine());

            System.out.println(stala);

            if (wejscie != 42 && stala == 42) {
                zmienna++; }
            if (zmienna == 3)
                break;
        }
    }
}
