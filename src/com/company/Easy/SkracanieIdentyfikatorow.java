package com.company.Easy;

import java.util.Scanner;

/**
 * WI_IDEN - Skracanie identyfikatorów
 * <p>
 * (...) napisz nazwę zmiennej w postaci, w której życzyłbyś sobie ją widzieć – używaj tylko liter,
 * cyfr oraz znaków '_' (podkreślenie) i '$' (dolar); może zabrzmi to dziwnie, ale znak '$'
 * traktować będziemy jak literę (czyni to do dzisiaj wiele kompilatorów);
 * <p>
 * jeśli długość nazwy jest mniejsza równa n, możesz jej użyć i nie musisz robić nic więcej
 * <p>
 * w przeciwnym wypadku usuwaj z nazwy, począwszy od końca, wszystkie znaki,
 * które nie są literami i cyframi – w chwili, w której długość nazwy osiągnie n,
 * możesz zakończyć pracę i użyć nazwy zmiennej
 * <p>
 * jeśli długość nazwy nadal jest większa od n, usuwaj z niej, począwszy od końca,
 * kolejne cyfry - w chwili, w której długość nazwy osiągnie n możesz zakończyć pracę i użyć nazwy zmiennej
 * <p>
 * jeśli długość nazwy nadal jest większa od n, usuwaj z niej, począwszy od początku,
 * kolejne samogłoski z wyjątkiem pierwszej (chodzi o to, by w nazwie została chociaż jedna samogłoska,
 * o ile jakakolwiek została użyta) - w chwili, w której długość nazwy osiągnie n, możesz zakończyć
 * pracę i użyć nazwy zmiennej
 * <p>
 * jeśli długość nazwy nadal jest większa od n, usuwaj z niej znaki od końca,
 * począwszy od przedostatniego - w chwili, w której długość nazwy osiągnie n,
 * możesz zakończyć pracę i użyć nazwy zmiennej
 * <p>
 * Polecenie: napisz program, który skróci dowolną nazwę zmiennej do maksymalnej długości
 * n w sposób opisany powyższym algorytmem.
 * <p>
 * Dane wejściowe:
 * <p>
 * 2 wiersze, zawierające kolejno:
 * maksymalną dopuszczalną długość zmiennej
 * (n: n >= 1 i n <= 65535)
 * <p>
 * nazwę zmiennej (o długości l), która będzie podlegać skracaniu
 * (l: l >= 1 i l <= 65636)
 * <p>
 * Dane wyjściowe:
 * <p>
 * jeden wiersz, zawierający nazwę zmiennej poddaną algorytmowi skracania.
 * Przykład:
 * <p>
 * Wejście:
 * <p>
 * 7
 * ALA_MA_KOTA_I_2_PSY
 * <p>
 * Wyjście:
 * <p>
 * ALMKTPS
 */

public class SkracanieIdentyfikatorow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dlugosc = sc.nextInt();
        String wejscie = sc.next();
        skracanieIdentyfikatorow(dlugosc, wejscie);
    }

    private static void skracanieIdentyfikatorow(int t, String s) {
        if (t >= 1 && t <= 65535 && s.length() >= 1 && s.length() <= 65636) {
            if (s.length() <= t) {
                System.out.println(s);
            } else {
                StringBuilder tekst = new StringBuilder(s);

                for (int p = 1; p < s.length() + 1; p++) {
                    if (tekst.charAt(s.length() - p) == '_' || tekst.charAt(s.length() - p) == '&') {
                        tekst.deleteCharAt(s.length() - p);
                    }
                    if (tekst.length() == t) {
                        break;
                    }
                }

                int drugieT = tekst.length();

                if (tekst.length() > t) {
                    for (int i = 1; i < drugieT + 1; i++) {
                        if (tekst.charAt(drugieT - i) == '0' || tekst.charAt(drugieT - i) == '1' ||
                                tekst.charAt(drugieT - i) == '2' || tekst.charAt(drugieT - i) == '3' ||
                                tekst.charAt(drugieT - i) == '4' || tekst.charAt(drugieT - i) == '5' ||
                                tekst.charAt(drugieT - i) == '6' || tekst.charAt(drugieT - i) == '7' ||
                                tekst.charAt(drugieT - i) == '8' || tekst.charAt(drugieT - i) == '9') {
                            tekst.deleteCharAt(drugieT - i);
                        }
                        if (tekst.length() == t) {
                            break;
                        }
                    }
                }

                int trzecieT = tekst.length();
                int samogloska = 0;

                if (tekst.length() > t) {
                    String samogloski = "aeioóuyAEIOÓUY";
                    for (int i = 0; i < tekst.length(); i++) {
                        if (samogloski.contains(String.valueOf(tekst.charAt(i)))) {
                            samogloska = i;
                            break;
                        }
                    }

                    for (int j = samogloska + 1; j < trzecieT; j++) {
                        if (tekst.charAt(j) == 'a' || tekst.charAt(j) == 'e' || tekst.charAt(j) == 'i' || tekst.charAt(j) == 'u' ||
                                tekst.charAt(j) == 'y' || tekst.charAt(j) == 'o' || tekst.charAt(j) == 'ó' || tekst.charAt(j) == 'A' ||
                                tekst.charAt(j) == 'E' || tekst.charAt(j) == 'I' || tekst.charAt(j) == 'U' ||
                                tekst.charAt(j) == 'Y' || tekst.charAt(j) == 'O' || tekst.charAt(j) == 'Ó') {
                            tekst.deleteCharAt(j);
                            j--;
                            trzecieT--;
                        }
                        if (tekst.length() == t) {
                            break;
                        }
                    }
                }

                int czwarteT = tekst.length();

                if (tekst.length() > t) {
                    for (int j = 2; j < czwarteT + 2; j++) {
                        tekst.deleteCharAt(czwarteT - j);
                        if (tekst.length() == t) {
                            break;
                        }
                    }
                }
                System.out.println(tekst);
            }
        }
    }
}