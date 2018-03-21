package com.company.Easy;

import java.util.Scanner;

/**
 * PRZEDSZK - Przedszkolanka
 * <p>
 * Treść
 * W ostatnim czasie przedszkole opanowała nietypowa epidemia. Nie dotknęła ona przedszkolaków,
 * tylko panie opiekujące się dziećmi. Pośród nielicznych zdrowych pozostała,
 * ulubiona przez wszystkie maluchy, pani Agnieszka. Postanowiła osłodzić podopiecznym nieobecność
 * wychowawczyń i rozdać im trochę cukierków. Przedszkolanka wie, że następnego dnia będzie się zajmowała
 * jedną z dwóch grup. Zna też liczbę dzieci w każdej z nich. Chce teraz dobrać taką liczbę słodyczy,
 * by można nią było obdarować wszystkie dzieci, niezależnie od grupy, którą będzie prowadziła.
 * Musi przy tym spełnić kilka warunków. Po pierwsze, każdy z przedszkolaków powinien otrzymać jednakową
 * (oczywiście niezerową) liczbę cukierków. Po drugie, liczba słodyczy powinna być taka,
 * by można było rozdać je wszystkie. Po trzecie, ponieważ budżet przedszkola jest ograniczony,
 * pani Agnieszka musi kupić minimalną liczbę cukierków spełniającą dwa wcześniejsze warunki.
 * Pomóż sympatycznej przedszkolance i napisz program, który obliczy, ile cukierków powinna kupić.
 * <p>
 * Wejście
 * Dane podawane są na standardowe wejście. W pierwszym wierszu podana jest liczba N (1<=N<=20) zestawów danych.
 * Dalej podawane są zestawy danych zgodnie z poniższym opisem:
 * <p>
 * Jeden zestaw danych
 * W pierwszym i jedynym wierszu zestawu danych znajdują się dwie liczby całkowite a i b (10<=a,b<=30),
 * oddzielone pojedynczą spacją, oznaczające odpowiednio liczbę przedszkolaków w grupach, z których jedna
 * zostanie przydzielona pani Agnieszce.
 * <p>
 * Wyjście
 * Wyniki programu powinny być wypisywane na standardowe wyjście. W kolejnych wierszach należy podać
 * odpowiedzi obliczone dla kolejnych zestawów danych. Wynikiem dla jednego zestawu jest liczba cukierków,
 * jaką powinna zakupić przedszkolanka.
 * <p>
 * Przykład
 * <p>
 * dane wejściowe:
 * 2
 * 12 15
 * 11 22
 * <p>
 * wynik:
 * 60
 * 22
 */

public class Przedszkolanka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iloscTestow = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < iloscTestow; i++) {
            String liczby = sc.nextLine();
            String[] tablica = liczby.split(" ");
            przedszkolanka(Integer.parseInt(tablica[0]), Integer.parseInt(tablica[1]));
        }
    }

    public static void przedszkolanka(int x, int y) {
        if (x >= 10 && y <= 30) {
            int suma = 0;
            for (int i = 1; i < 1000; i++) {
                if (i % x == 0 && i % y == 0) {
                    suma = i;
                    break;
                }
            }
            System.out.println(suma);
        }
    }
}
