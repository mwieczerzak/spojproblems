package com.company.Medium;

/**
 * http://pl.spoj.com/problems/ETI07E8/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetniePromocje {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String wejscie = r.readLine();
        String[] tablica = new String[Integer.parseInt(wejscie.substring(0, 1)) + Integer.parseInt(wejscie.substring(2, 3))];
        for (int i = 0; i < tablica.length; i++) {
            String slowo = r.readLine();
            tablica[i] = slowo;
        }

        int[] cyfry = {2, 3, 4, 5, 6, 7, 8, 9};
        String[] litery = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int j = 0; j < Integer.parseInt(wejscie.substring(2, 3)); j++) {
            String zmienna = "";
            String[] tablicaZLiczby = tablica[Integer.parseInt(wejscie.substring(0, 1)) + j].split("");
            for (int k = 0; k < tablicaZLiczby.length; k++) {
                for (int l = 0; l < cyfry.length; l++) {
                    if (Integer.valueOf(tablicaZLiczby[k]) == cyfry[l]) {
                        zmienna += litery[l];
                        break;
                    }
                }
            }
            int zmiennaPomocnicza = 0;
            for (int m = 0; m < Integer.parseInt(wejscie.substring(0, 1)); m++) {
                String schowek = "";
                String[] tablicaZeSlowa = tablica[m].split("");
                for (int n = 0; n < tablicaZeSlowa.length; n++) {
                    if (zmienna.contains(tablicaZeSlowa[n])) {
                        schowek += tablicaZeSlowa[n];
                    }
                }
                if (schowek.length() == tablicaZeSlowa.length) {
                    System.out.print(tablica[m] + " ");
                } else {
                    zmiennaPomocnicza++;
                }
                if (zmiennaPomocnicza == Integer.parseInt(wejscie.substring(0, 1))) {
                    System.out.print("BRAK");
                }
            }
            System.out.println();
        }
    }
}