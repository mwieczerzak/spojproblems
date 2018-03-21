package com.company.Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * SUMA - Suma
 * Napisz program, który oblicza sumę pojawiających się na wejściu liczb.
 * <p>
 * Wejście
 * Na wejście programu podana zostanie pewna nieokreślona,
 * ale niewielka ilość małych liczb całkowitych (z zakresu -100..100).
 * Poszczególne liczby zostaną rozdzielone znakiem nowej linii.
 * <p>
 * Wyjście
 * Na wyjściu ma się pojawić ciąg liczbowy, którego i-ta pozycja jest
 * równa sumie i pierwszych wczytanych z wejścia liczb.
 * Poszczególne liczby należy rozdzielić znakami nowej linii.
 * <p>
 * Przykład
 * Wejście:
 * 6
 * 8
 * -3
 * <p>
 * Wyjście:
 * 6
 * 14
 * 11
 */
public class Suma {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int suma = 0;
        for (int i = 0; i < 10; i++) {
            int liczba = Integer.parseInt(r.readLine());
            suma += liczba;
            System.out.println(suma);
        }
    }
}
