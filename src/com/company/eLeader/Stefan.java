package com.company.eLeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://pl.spoj.com/problems/FZI_STEF/
 */

public class Stefan {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = Integer.parseInt(reader.readLine());
        int[] cities = new int[numberOfTests];
        long sumFromPlannedCities = 0;
        long maxPossibleProfit = 0;
        long actualSumFromCities = 0;

        for (int testNumber = 0; testNumber < numberOfTests; testNumber++) {
            int inputNumber = Integer.valueOf(reader.readLine());
            cities[testNumber] = inputNumber;
            sumFromPlannedCities += inputNumber;
            actualSumFromCities = sumFromPlannedCities;
            maxPossibleProfit = sumFromPlannedCities;
        }

        long lastCitySum = 0;
        for (int j = 0; j < numberOfTests; j++) {
            for (int i = 0; i < cities.length - j - 1; i++) {
                actualSumFromCities -= cities[i];
                if (actualSumFromCities > maxPossibleProfit) {
                    maxPossibleProfit = actualSumFromCities;
                }
            }
            lastCitySum += cities[cities.length - j - 1];
            actualSumFromCities = sumFromPlannedCities - lastCitySum;
            if (actualSumFromCities > maxPossibleProfit) {
                maxPossibleProfit = actualSumFromCities;
            }
        }
        System.out.println(maxPossibleProfit);
    }

}
