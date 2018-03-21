package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 POL - Połowa
 Dla podanego ciągu długości 2*k, wypisz na standardowe wyjście dokładnie pierwszą połowę ciągu.

 Wejście
 W pierwszej linijce wejścia znajduje się jedna liczba całkowita t (1<=t<=100).
 Każdy wiersz o numerze od 2 do t+1, zawiera ciąg długości 2*k (1<=k<=1000).

 Wyjście
 Dla każdego przypadku testowego na wyjściu powinien pojawić się ciąg będący pierwszą połową wczytanego ciągu.

 Example
 Wejście:
 3
 pierwszy
 lubiec
 ktotozrobi

 Output:
 pier
 lub
 ktoto
 *
 */

public class Połowa {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int liczbaTestow = Integer.parseInt(r.readLine());

        for (int i = 0; i < liczbaTestow; i++) {
            String wejscie = r.readLine();
            String[] tablica = wejscie.split("");
            String polowaWejscia = "";
            for (int j = 0; j < tablica.length / 2; j++) {
                polowaWejscia += tablica[j];
            }
            System.out.println(polowaWejscia);
        }
    }
}
