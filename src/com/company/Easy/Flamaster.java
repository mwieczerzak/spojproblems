package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * FLAMASTE - Flamaster
 * Twoim zadaniem jest dla zadanego wyrazu, który wymyśliła Kasia, podanie skróconej wersji tego wyrazu.
 * <p>
 * Wejście
 * W pierwszej linijce wejścia znajduje się liczba naturalna C, 1 ≤ C ≤ 50, oznaczająca ilość zestawów danych.
 * W kolejnych C wierszach wejścia znajdują się zestawy danych. Każdy zestaw składa się z niepustego wyrazu
 * złożonego z samych dużych liter alfabetu amerykańskiego. Długość wyrazu nie przekracza 200 znaków.
 * <p>
 * Wyjście
 * Dla każdego zestawu danych, dla zadanego wyrazu, na wyjściu powinna znaleźć się jego skrócona wersja.
 * <p>
 * Przykład
 * Dla danych wejściowych:
 * 4
 * OPSS
 * ABCDEF
 * ABBCCCDDDDEEEEEFGGHIIJKKKL
 * AAAAAAAAAABBBBBBBBBBBBBBBB
 * <p>
 * prawidłowym rozwiązaniem jest:
 * OPSS
 * ABCDEF
 * ABBC3D4E5FGGHIIJK3L
 * A10B16
 */

public class Flamaster {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int iloscTestow = Integer.parseInt(r.readLine());

        for (int j = 0; j < iloscTestow; j++) {
            String wejscie = r.readLine();
            String wyjscie = "";
            int suma = 1;

            for (int i = 0; i < wejscie.length() - 1; i++) {
                if (wejscie.charAt(i) == wejscie.charAt(i + 1)) {
                    suma++;
                } else {
                    if (suma > 2) {
                        wyjscie = wyjscie + wejscie.charAt(i) + suma;
                        suma = 1;
                    } else if (suma == 2) {
                        wyjscie = wyjscie + wejscie.charAt(i) + wejscie.charAt(i);
                        suma = 1;
                    } else {
                        wyjscie = wyjscie + wejscie.charAt(i);
                        suma = 1;
                    }
                }
            }
            if (suma > 2) {
                wyjscie = wyjscie + wejscie.charAt(wejscie.length() - 1) + suma;
            } else if (suma == 2) {
                wyjscie = wyjscie + wejscie.charAt(wejscie.length() - 1) + wejscie.charAt(wejscie.length() - 1);
            } else {
                wyjscie = wyjscie + wejscie.charAt(wejscie.length() - 1);
            }
            System.out.println(wyjscie);
        }
    }
}
