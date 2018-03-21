package com.company.Easy;

import java.util.Scanner;

/**
 * WI_TRIGR - Zastępowanie trójznaków
 * <p>
 * (...)
 * Polecenie: napisz program, który wczyta ze standardowego wejścia program w języku C,
 * zapisany z użyciem trójznaków i wypisze na standardowe wyjście ten sam program, ale zapisany klasycznie.
 * <p>
 * <p>
 * Dane wejściowe: pewna (nieznana z góry) liczba linii tekstu (każda o nieznanej z góry długości),
 * składającego się na program w języku C zawierający trójznaki
 * <p>
 * Dane wyjściowe: program w języku C po zamianie trójznaków na znaki klasyczne
 * <p>
 * Przykład:
 * <p>
 * Wejście:
 * <p>
 * ??=include <stdio.h>
 * <p>
 * int main(int argc, char *argv??(??))
 * <p>
 * ??<
 * <p>
 * puts(”Hello world!”);
 * <p>
 * return 0;
 * <p>
 * ??>
 * <p>
 * <p>
 * Wyjście:
 * <p>
 * #include <stdio.h>
 * <p>
 * int main(int argc, char *argv[] )
 * <p>
 * { puts(”Hello world!”);
 * <p>
 * return 0; }
 */

public class ZastepowanieTrojznakow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wejscie = sc.nextLine();
        zamiana(wejscie);
    }

    private static void zamiana(String znak) {
        znak = znak.replace("??=", "#");
        znak = znak.replace("??/", "\\");
        znak = znak.replace("??'", "^");
        znak = znak.replace("??(", "[");
        znak = znak.replace("??)", "]");
        znak = znak.replace("??!", "|");
        znak = znak.replace("??<", "{");
        znak = znak.replace("??>", "}");
        znak = znak.replace("??-", "~");
        System.out.println(znak);
    }
}
