package com.company.Easy;

import java.util.Scanner;

/**
 * WI_SZYFR - Szyfr Gronsfelda
 * <p>
 * (...)
 * <p>
 * tekst jawny	CEZAR
 * klucz	123
 * tekst zaszyfrowany	DGCBT
 * Znając już sposób szyfrowania metodą Gronsfelda, bez problemu ustalisz, jak wygląda procedura deszyfracji.
 * <p>
 * Polecenie: napisz program, który szyfruje i deszyfruje wiadomości,wykorzystując metodę Gronsfelda.
 * <p>
 * Dane wejściowe: 3 wiersze tekstu, zawierające kolejno:
 * <p>
 * słowo SZYFRUJ lub DESZYFRUJ, oznaczające odpowiednio polecenie zaszyfrowania lub odszyfrowania wiadomości;
 * <p>
 * liczbę całkowitą k, będącą kluczem szyfru Gronsfelda (0 <= k <= 1000000000);
 * <p>
 * tekst do szyfrowania/deszyfrowania o nieznanej z góry długości, składający się tylko
 * i wyłącznie z wielkich liter alfabetu łacińskiego.
 * <p>
 * Dane wyjściowe: jeden wiersz tekstu, wynikający z szyfrowania/deszyfrowania tekstu podanego
 * programowi w trzecim wierszu standardowego wejścia.
 * <p>
 * Przykład:
 * <p>
 * Wejście:
 * <p>
 * SZYFRUJ
 * <p>
 * 12340
 * <p>
 * ALAMAKOTA
 * <p>
 * Wyjście:
 * <p>
 * BNDQALQWE
 * <p>
 * <p>
 * Wejście:
 * <p>
 * DESZYFRUJ
 * <p>
 * 12340
 * <p>
 * BNDQALQWE
 * <p>
 * Wyjście:
 * <p>
 * ALAMAKOTA
 */

public class SzyfrGronsfelda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String metoda = sc.next();
        int liczby = sc.nextInt();
        String slowo = sc.next();

        if (liczby >= 0 && liczby <= 1000000000) {
            szyfruj(liczby, slowo, metoda);
        }
    }

    private static void szyfruj(Integer cyfry, String slowo, String metoda) {

        char[] tablica = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int[] tablicaCyfr = new int[slowo.length()];
        int x = 0;
        for (int z = 0; z < slowo.length(); z++) {
            if (z % cyfry.toString().length() == 0) {
                x = 0;
            }
            tablicaCyfr[z] = cyfry.toString().charAt(x) - '0';
            x++;
        }
        String noweSlowo = "";
        int j = 0;
        char nowaLitera = 0;

        for (int i = 0; i < slowo.length(); i++) {
            for (int k = 0; k < tablica.length; k++) {
                if (slowo.charAt(j) == tablica[k]) {
                    if (metoda.equals("SZYFRUJ")) {
                        nowaLitera = alfabet.charAt(k + tablicaCyfr[i]);
                    } else if (metoda.equals("DESZYFRUJ")) {
                        nowaLitera = alfabet.charAt(26 + (k - tablicaCyfr[i]));
                    }
                }
            }
            noweSlowo += nowaLitera;
            j++;
        }
        System.out.println(noweSlowo);
    }
}
