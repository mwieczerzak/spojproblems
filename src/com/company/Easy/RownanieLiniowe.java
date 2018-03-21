package com.company.Easy;

import java.util.Scanner;

/**
 * JROWLIN - Równanie liniowe
 * Równanie liniowe jest postaci ax+b=c, gdzie a, b, c są liczbami rzeczywistymi.
 * Niewiadomą jest x, która również jest liczbą rzeczywistą.
 * Równanie to może mieć jedno rozwiązanie, brak rozwiązań lub nieskończenie wiele rozwiązań.
 * <p>
 * Input
 * W pojedyńczej linii podane są trzy liczby rzeczywiste zaokrąglone do drugiego miejsca po przecinku.
 * <p>
 * Output
 * Rozwiązaniem problemu jest liczba rzeczywista zaokrąglona do drugiego miejsca po przecinku w przypadku,
 * gdy równanie liniowe ax+b=c posiada rozwiązanie. W przypadku braku rozwiązania powinien zostać wydrukowany napis BR,
 * a w przypadku nieskończenie wielu rozwiązań napis NWR
 * <p>
 * Example 1
 * Input:
 * 0.52 1.60 -5.44
 * <p>
 * Output:
 * -13.54
 */

public class RownanieLiniowe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String wejscie = sc.nextLine();
        String[] tablica = wejscie.split(" ");
        Double x;
        x = (Double.valueOf(tablica[2]) - Double.valueOf(tablica[1])) / Double.valueOf(tablica[0]);

        if (x.isInfinite()) {
            System.out.println("BR");
        } else if (x.isNaN()) {
            System.out.println("NWR");
        } else
            System.out.println(String.format("%.2f", x));
    }
}

