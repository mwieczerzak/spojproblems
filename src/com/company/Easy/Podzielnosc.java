package com.company.Easy;

import java.util.Scanner;

/**
 * PP0601B - Podzielność
 * Wypisz wszystkie liczby ai podzielne przez x i niepodzielne przez y, gdzie 1 < ai < n < 100000.
 * <p>
 * Wejście
 * Najpierw w oddzielnej linii t liczba przypadków testowych następnie w kolejnych t liniach liczby n x y.
 * <p>
 * Wyjście
 * W kolejnych t liniach oddzielone pojedynczym odstępem liczby spełniające warunki zadania
 * wypisane od najmniejszej do największej.
 * <p>
 * Przykład
 * Wejście:
 * 2
 * 7 2 4
 * 35 5 12
 * Wyjście:
 * 2 6
 * 5 10 15 20 25 30
 */

public class Podzielnosc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczbaTestow = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < liczbaTestow; i++) {
            String liczby = sc.nextLine();
            String[] tablica = liczby.split(" ");
            podzielnosc(Integer.parseInt(tablica[0]), Integer.parseInt(tablica[1]), Integer.parseInt(tablica[2]));
            System.out.println();
        }
    }

    public static void podzielnosc(int x, int y, int z) {

        for (int i = 0; i < x; i++) {
            if (i % y == 0 && i % z != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
