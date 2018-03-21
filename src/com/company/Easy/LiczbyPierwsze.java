package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 PRIME_T - Liczby Pierwsze
 Sprawdź, które spośród danych liczb są liczbami pierwszymi

 Input
 n - liczba testów n<100000, w kolejnych liniach n liczb z przedziału [1..10000]

 Output
 Dla każdej liczby słowo TAK, jeśli liczba ta jest pierwsza, słowo: NIE, w przeciwnym wypadku.

 Example
 Input:
 3
 11
 1
 4

 Output:
 TAK
 NIE
 NIE
 */

public class LiczbyPierwsze {

    public static void main (String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int iloscTestow = Integer.parseInt(r.readLine());

        for (int i = 0; i < iloscTestow; i++) {
            int liczba = Integer.parseInt(r.readLine());
            int suma = 0;
            for (int j = 2; j < liczba; j++) {
                if (liczba % j == 0) {
                    suma = 2;
                    break;
                }
            }
            if (suma == 2 || liczba == 1) {
                System.out.println("NIE");
            } else {
                System.out.println("TAK");
            }
        }
    }
}
