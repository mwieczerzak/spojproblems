package com.company.eLeader;

/**
 * https://pl.spoj.com/problems/SKARBFI/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkarbFinder {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTests = Integer.valueOf(reader.readLine());

        for (int testNumber = 0; testNumber < numberOfTests; testNumber++) {
            int numberOfTips = Integer.valueOf(reader.readLine());
            int coordinate1 = 0;
            int coordinate2 = 0;

            for (int tipNumber = 0; tipNumber < numberOfTips; tipNumber++) {
                String inputTips = reader.readLine();
                String[] inputArray = inputTips.split(" ");

                switch (inputArray[0]) {
                    case "0":
                        coordinate1 += Integer.parseInt(inputArray[1]);
                        break;
                    case "1":
                        coordinate1 -= Integer.parseInt(inputArray[1]);
                        break;
                    case "2":
                        coordinate2 -= Integer.parseInt(inputArray[1]);
                        break;
                    case "3":
                        coordinate2 += Integer.parseInt(inputArray[1]);
                        break;
                    default:
                        System.out.println("Wrong coordinates");
                }
            }
            if (coordinate1 == 0 && coordinate2 == 0) {
                System.out.println("studnia");
            } else {
                if (coordinate1 > 0) {
                    System.out.println(0 + " " + coordinate1);
                } else if (coordinate1 < 0) {
                    System.out.println(1 + " " + Math.abs(coordinate1));
                }
                if (coordinate2 > 0) {
                    System.out.println(3 + " " + coordinate2);
                } else if (coordinate2 < 0) {
                    System.out.println(2 + " " + Math.abs(coordinate2));
                }
            }
        }

    }
}
