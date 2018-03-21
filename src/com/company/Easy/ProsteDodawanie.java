package com.company.Easy;

import java.util.Scanner;

/**
 * RNO_DOD - Proste dodawanie
 Twoim zadaniem jest dodać wszystkie liczby całkowite podane na wejściu.

 Wejście
 W pierwszym wierszu znajduje się liczba t testów (0 < t < 100) Każdy test opisany jest w następujący sposób.
 W pierwszym wierszu dana jest liczba n - liczba liczb do zsumowania.
 Następnie podanych jest n liczb pooddzielanych spacją.

 Przykład
 Input:
 2
 5
 1 2 3 4 5
 2
 -100 100

 Output:
 15
 0
 */

public class ProsteDodawanie {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int liczbaTestow = sc.nextInt();

        for (int j = 0; j < liczbaTestow; j++) {
            int liczbyDoZsumowania = sc.nextInt();
            int[] tablica = new int[liczbyDoZsumowania];
            for (int k = 0; k < tablica.length; k++) {
                tablica[k] = sc.nextInt();
            }
            dodawanieTablicy(tablica);
        }
    }

    private static void dodawanieTablicy(int[] liczby) {
        int wynik = 0;
        for (int i = 0; i < liczby.length; i++) {
            wynik += liczby[i];
        }
        System.out.println(wynik);
    }
}
