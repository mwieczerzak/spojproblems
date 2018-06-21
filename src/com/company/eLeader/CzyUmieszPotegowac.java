package com.company.eLeader;

/**
 * https://pl.spoj.com/problems/PA05_POT/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CzyUmieszPotegowac {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = Integer.parseInt(reader.readLine());

        for (int testNumber = 0; testNumber < numberOfTests; testNumber++) {
            String inputNumbers = reader.readLine();
            String[] inputNumbersArray = inputNumbers.split(" ");

            if (inputNumbersArray[0].endsWith(String.valueOf(0))
                    || inputNumbersArray[0].endsWith(String.valueOf(1))
                    || inputNumbersArray[0].endsWith(String.valueOf(5))
                    || inputNumbersArray[0].endsWith(String.valueOf(6))) {
                System.out.println(inputNumbersArray[0].charAt(inputNumbersArray[0].length() - 1));
            } else if (inputNumbersArray[0].endsWith(String.valueOf(4))) {
                if (Integer.valueOf(inputNumbersArray[1]) % 2 == 0) {
                    System.out.println(4);
                } else {
                    System.out.println(6);
                }
            } else if (inputNumbersArray[0].endsWith(String.valueOf(9))) {
                if (Integer.valueOf(inputNumbersArray[1]) % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(9);
                }
            } else if (inputNumbersArray[0].endsWith(String.valueOf(2))
                    || inputNumbersArray[0].endsWith(String.valueOf(8))) {
                if (Integer.valueOf(inputNumbersArray[1]) % 2 == 0) {
                    if ((Integer.valueOf(inputNumbersArray[1]) / 2) % 2 == 0) {
                        System.out.println(6);
                    } else {
                        System.out.println(4);
                    }
                } else {
                    if ((Integer.valueOf(inputNumbersArray[1]) / 2) % 2 == 0) {
                        System.out.println(inputNumbersArray[0].charAt(inputNumbersArray[0].length() - 1));
                    } else {
                        if (inputNumbersArray[0].endsWith(String.valueOf(2))) {
                            System.out.println(8);
                        } else {
                            System.out.println(2);
                        }
                    }
                }
            } else if (inputNumbersArray[0].endsWith(String.valueOf(3))
                    || inputNumbersArray[0].endsWith(String.valueOf(7))) {
                if (Integer.valueOf(inputNumbersArray[1]) % 2 == 0) {
                    if ((Integer.valueOf(inputNumbersArray[1]) / 2) % 2 == 0) {
                        System.out.println(1);
                    } else {
                        System.out.println(9);
                    }
                } else {
                    if ((Integer.valueOf(inputNumbersArray[1]) / 2) % 2 == 0) {
                        System.out.println(inputNumbersArray[0].charAt(inputNumbersArray[0].length() - 1));
                    } else {
                        if (inputNumbersArray[0].endsWith(String.valueOf(3))) {
                            System.out.println(7);
                        } else {
                            System.out.println(3);
                        }
                    }
                }
            }
        }
    }
}
