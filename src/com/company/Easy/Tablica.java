package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * TABLICA - Tablica
 * Napisz program, który wczytuje z wejścia ciąg liczb i wypisuje go w odwróconej kolejności.
 * <p>
 * Wejście
 * Na wejście programu podana zostanie pewna nieokreślona, ale niewielka ilość liczb całkowitych rozdzielonych spacjami.
 * <p>
 * Wyjście
 * Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta pozycja jest równa (n+1-i)-tej liczbie wczytanej z wejścia,
 * gdzie n to ilość wczytanych liczb. Poszczególne liczby należy rozdzielić spacjami.
 * <p>
 * Przykład
 * Wejście:
 * 1 2 3
 * <p>
 * Wyjście:
 * 3 2 1
 */

public class Tablica {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String wejscie = reader.readLine();
        String[] tablica = wejscie.split(" ");
        int zmienna;
        for (int i = 0; i < tablica.length / 2; i++) {
            zmienna = Integer.parseInt(tablica[i]);
            tablica[i] = tablica[tablica.length - 1 - i];
            tablica[tablica.length - 1 - i] = String.valueOf(zmienna);
        }
        for (String liczby : tablica)
            System.out.print(liczby + " ");
    }
}

