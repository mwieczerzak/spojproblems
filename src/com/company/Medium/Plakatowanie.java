package com.company.Medium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * https://pl.spoj.com/problems/OI15_PLA/
 */
public class Plakatowanie {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfBuildings = Integer.parseInt(reader.readLine());
        Set<String> noDuplicateIntegers = new HashSet<>();

        for (int i = 0; i < numberOfBuildings; i++) {
            String poster = reader.readLine();
            String[]array = poster.split(" ");
            noDuplicateIntegers.add(array[1]);
        }
        System.out.println(noDuplicateIntegers.size());


    }
}
