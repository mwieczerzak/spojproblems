package com.company.Easy;

import java.util.Scanner;

/**
 * AL_28_01 - Piramidka
 * Masz dane słowo S o nieparzystej długości N. Na podstawie tego słowa wypisz piramidę taką jak w przykładzie.
 * <p>
 * Wejście
 * W pierwszej linii wejścia znajduje się nieparzysta liczba całkowita N (1 ≤ N ≤ 29).
 * <p>
 * W drugiej linii wejścia znajduje się napis S. Napis ten składa się tylko i wyłącznie z małych liter alfabetu łacińskiego.
 * <p>
 * Wyjście
 * Wypisz piramidę na podstawie słowa S w taki sposób jak w przykładzie.
 * <p>
 * Przykład
 * Wejście:
 * 9
 * piramidka
 * Wyjście:
 * ....m....
 * ...ami...
 * ..ramid..
 * .iramidk.
 * piramidka
 */

public class Piramidka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dlugoscSlowa = sc.nextInt();
        String slowo = sc.next();
        if (dlugoscSlowa >= 1 && dlugoscSlowa <= 29 && dlugoscSlowa % 2 != 0
                && slowo == slowo.toLowerCase() && slowo.length() == dlugoscSlowa) {
            piramidka(dlugoscSlowa, slowo);
        }
    }

    public static void piramidka(int a, String b) {

        String[] tablica = b.split("");

        for (int i = 0; i < a / 2; i++) {
            tablica[i] = ".";
            tablica[b.length() - 1 - i] = ".";
        }

        for (String x : tablica)
            System.out.print(x);
        System.out.println();

        for (int j = 1; j <= a / 2; j++) {
            tablica[a / 2 + j] = b.split("")[a / 2 + j];
            tablica[a / 2 - j] = b.split("")[a / 2 - j];

            for (String x : tablica)
                System.out.print(x);
            System.out.println();
        }
    }
}