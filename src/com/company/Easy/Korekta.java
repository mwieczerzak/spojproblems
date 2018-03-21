package com.company.Easy;

import java.util.Scanner;

/**
 * FR_08_02 - Korekta
 * Jasiu, Stasiu, Wiesiu i Grzesiu lubią grać w Brydża.
 * Za każdym razem dzielą się na dwa dwuosobowe zespoły, no i grają.
 * Każdy z nich prowadzi ogólną ewidencję liczby gier wygranych i przegranych.
 * Jasiu błędnie zsumował swoje wyniki i chciałby to skorygować.
 * Znając liczbę gier wygranych i przegranych pozostałych graczy,
 * należy wyznaczyć liczbę gier wygranych i przegranych Jasia.
 * <p>
 * Wejście
 * W pierwszym wierszu wejścia znajduje się liczba całkowita d (1 ≤ d ≤ 1000)
 * oznaczająca liczbę przypadków testowych. W kolejnych wierszach danych jest po sześć
 * liczb całkowitych nieujemnych nie większych od 106 oznaczających liczbę zwycięstw
 * i porażek odpowiednio Stasia, Wiesia i Grzesia.
 * <p>
 * Wyjście
 * Dla każdego przypadku testowego należy wypisać dwie wartości - liczbę zwycięstw i porażek Jasia.
 * <p>
 * Przykład
 * <p>
 * Wejście
 * 2
 * 8 7 3 12 10 5
 * 0 10 0 10 10 0
 * <p>
 * Wyjście
 * 9 6
 * 10 0
 */
public class Korekta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iloscTestow = sc.nextInt();
        sc.nextLine();
        if (iloscTestow >= 1 && iloscTestow <= 1000) {
            for (int i = 0; i < iloscTestow; i++) {
                String liczby = sc.nextLine();
                korekta(liczby);
                System.out.println();
            }
        }
    }

    public static void korekta(String l) {
        String[] tablica = l.split(" ");
        int wygrane = Integer.parseInt(tablica[0]) + Integer.parseInt(tablica[2]) + Integer.parseInt(tablica[4]);
        int przegrane = Integer.parseInt(tablica[1]) + Integer.parseInt(tablica[3]) + Integer.parseInt(tablica[5]);
        int suma = Integer.parseInt(tablica[0]) + Integer.parseInt(tablica[1]);
        int a;
        int b;

        if (wygrane > przegrane) {
            int roznica = wygrane - przegrane;
            a = 0;
            b = roznica;
            for (int i = 0; i < suma; i++) {
                if (a + b == suma && b - a == roznica) {
                    System.out.print(a + " " + b);
                    break;
                }
                a++;
                b++;
            }

        } else if (przegrane > wygrane) {
            int roznica = przegrane - wygrane;
            a = roznica;
            b = 0;
            for (int j = 0; j < suma; j++) {
                if (a + b == suma && a - b == roznica) {
                    System.out.print(a + " " + b);
                    break;
                }
                a++;
                b++;
            }
        } else {
            a = suma / 2;
            b = suma / 2;
            System.out.println(a + " " + b);
        }
    }
}
