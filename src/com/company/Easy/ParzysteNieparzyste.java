package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * PP0602A - Parzyste nieparzyste
 * Wczytaj ciąg liczb. Następnie wypisz wczytane liczby w taki sposób, aby najpierw pojawiły się te,
 * które wystąpiły na pozycjach parzystych, a następnie te, które wystąpiły na pozycjach nieparzystych;
 * z zachowaniem pierwotnej kolejności w obrębie obu grup. Numerujemy od 1.
 * <p>
 * Wejście
 * Najpierw t - liczba testów. Następnie dla każdego testu liczba n i n liczb, n <= 100.
 * <p>
 * Wyjście
 * Dla każdego testu n liczb w opisanym porządku.
 * <p>
 * Przykład
 * Wejście:
 * 2
 * 4 1 2 3 5
 * 3 9 8 7
 * <p>
 * Wyjście:
 * 2 5 1 3
 * 8 9 7
 */
public class ParzysteNieparzyste {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int liczbaTestow = Integer.parseInt(reader.readLine());

        for (int i = 0; i < liczbaTestow; i++) {
            String wejscie = reader.readLine();
            String tablica[] = wejscie.split(" ");
            String tablicaOut[] = new String[tablica.length - 1];
            int j;
            int k = 2;
            for (j = 0; j < (tablica.length - 1) / 2; j++) {
                tablicaOut[j] = tablica[k];
                k = k + 2;
            }
            for (int o = 1; o < (tablica.length); o = o + 2) {
                tablicaOut[j] = tablica[o];
                j++;
            }
            for (String liczba : tablicaOut)
                System.out.print(liczba + " ");
            System.out.println();
        }
    }
}

