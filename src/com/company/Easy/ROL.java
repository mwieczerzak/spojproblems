package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 PP0602D - ROL (k)
 Przesuń elementy tablicy cyklicznie w lewo o zadaną liczbę miejsc.

 Input
 Najpierw dwie liczby n i k takie, że 1 < k < n < 10000, a następnie w kolejnym wierszu n liczb.

 Output
 W jednym wierszu n liczb w zmienionym porządku (przesuniętych cyklicznie o k miejsc).

 Example
 Input:
 5 3
 1 2 3 4 5

 Output:
 4 5 1 2 3
 */

public class ROL {

    public static void main (String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String wejscie = r.readLine();
        String cyfryTablicy = r.readLine();

        String[] tablicaPrzesuniec = wejscie.split(" ");
        String[] tablicaCyfr = cyfryTablicy.split(" ");
        int zmienna;
        int j = 0;
        for (int i = 0; i < Integer.valueOf(tablicaPrzesuniec[1]); i++) {
            zmienna = Integer.valueOf(tablicaCyfr[j]);
            for (int k = 0; k < tablicaCyfr.length; k++) {
                tablicaCyfr[j + k] = tablicaCyfr[j + k + 1];
                if (k == tablicaCyfr.length - 2) {
                    tablicaCyfr[j + k + 1] = String.valueOf(zmienna);
                    break;
                }
            }
        }
        for (String x : tablicaCyfr)
            System.out.print(x + " ");
    }
}