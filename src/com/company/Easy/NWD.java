package com.company.Easy;

import java.util.Scanner;

/**
 * PP0501A - NWD
 * Napisz funkcję:
 * <p>
 * int nwd(int a, int b);
 * która oblicza największy wspólny dzielnik liczb a i b,
 * <p>
 * 0 <= a,b <= 1000000
 * Input
 * <p>
 * <p>
 * W pierwszej linii liczba testów t, w kolejnych liniach po dwie liczby w każdym wierszu.
 * <p>
 * Output
 * W każdej linii jedna liczba - wynik działania funkcji nwd
 * <p>
 * Example
 * Input:
 * 5
 * 1 4
 * 4 1
 * 12 48
 * 48 100
 * 123456 653421
 * <p>
 * Output:
 * 1
 * 1
 * 12
 * 4
 * 3
 */

public class NWD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int liczbaTestow = sc.nextInt();
        for (int i = 0; i < liczbaTestow; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(nwd(a, b));
        }
    }

    public static int nwd(int a, int b) {
        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}
