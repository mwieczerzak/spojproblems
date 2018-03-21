package com.company.Easy;

import java.util.Scanner;

/**
 * JZAPKAB - Kabalistyczny zapis daty
 Istnieje bardzo łatwy sposób zapisu daty. Ten typowo barokowy pomysł nawiązywał do kabały,
 w której literom hebrajskim przypisane były liczby. W tym wypadku litery alfabetu łacińskiego
 odpowiadały następującym liczbom:

 A       B       C       D       E       F       G       H       I       K
 1       2       3       4       5       6       7       8       9       10
 L       M       N       O       P       Q       R       S       T       V
 20      30      40      50      60      70      80      90      100     200
 X       Y       Z
 300     400     500

 Datę oblicza się sumując wszystkie liczby odpowiadające kolejnym literom tekstu.
 Zapis stosowano w drukach i rękopisach. W przypadku druków najczęściej podawano pod poszczególnymi
 słowami sumę liczb ich liter. Autorzy trudzili się nad stworzeniem tekstu, z którego daje się odczytać datę.

 Input
 Na wejściu podany jest wyraz, pisany małymi literami (używając wyłącznie liter podanych powyżej).
 Wyraz nie większy niż 25 znaków.

 Output
 Na wyjściu podany jest rok w postaci liczby naturalnej,
 który zapisałeś za pomocą wyrazu (czyli sumy każdej z liczb).

 Example 1
 Input:
 info

 Output:
 105
 Example 2
 Input:
 miska

 Output:
 140
 */

public class KabalistycznyZapisDaty {

    public static void main (String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        String slowo = sc.nextLine();
        kabala(slowo);
    }

    public static void kabala(String x) {
        String noweSlowo = x.toUpperCase();
        char[] tablicaLiter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'V', 'X', 'Y', 'Z'};
        int[] tablicaLiczb = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 200, 300, 400, 500};

        int litera;
        int suma = 0;
        for (int i = 0; i < noweSlowo.length(); i++) {
            for (int z = 0; z < tablicaLiczb.length; z++) {
                if (noweSlowo.charAt(i) == tablicaLiter[z]) {
                    litera = tablicaLiczb[z];
                    suma += litera;
                    break;
                }
            }
        }
        System.out.println(suma);
    }
}
