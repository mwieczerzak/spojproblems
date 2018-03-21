package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * VSR - Predkość średnia
 * Pociąg z miejscowości A do B jedzie z prędkością v1, a wraca z miejscowości B do A z prędkością v2.
 * Obliczyć średnią prędkość na całej trasie. Uwaga: Dane wejściowe będą tak dobrane, aby wynik był liczba całkowitą.
 * <p>
 * Wejście
 * Na wejściu znajduje się dokładnie jedna liczba całkowita t (1<=t<=1000) oznaczająca liczbę zestawów danych.
 * W wierszach od 2 do t+1 znajdują się dwie liczby całkowite oddzielone spacja v1 oraz v2 (1<=v1,v2<=10000).
 * <p>
 * Wyjście
 * Wyjście składa się z t wierszy. W każdym wierszu powinna znaleźć się dokładnie jedna liczba całkowita
 * oznaczająca średnią prędkość.
 * <p>
 * Przykład
 * Wejście:
 * 2
 * 50 50
 * 60 40
 * <p>
 * Wyjście:
 * 50
 * 48
 */

public class PredkoscSrednia {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int liczbaZestawowDanych = Integer.parseInt(r.readLine());

        for (int i = 0; i < liczbaZestawowDanych; i++) {
            String wejscie = r.readLine();
            String[] tablica = wejscie.split(" ");
            int predkoscSrednia = 2 * Integer.parseInt(tablica[0]) * Integer.parseInt(tablica[1])
                    / (Integer.parseInt(tablica[0]) + Integer.parseInt(tablica[1]));
            System.out.println(predkoscSrednia);
        }
    }
}

