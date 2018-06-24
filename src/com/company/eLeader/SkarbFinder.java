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
            int coordinateX = 0;
            int coordinateY = 0;

            for (int tipNumber = 0; tipNumber < numberOfTips; tipNumber++) {
                String inputTips = reader.readLine();
                String[] inputArray = inputTips.split(" ");

                switch (inputArray[0]) {
                    case "0":
                        coordinateX += Integer.parseInt(inputArray[1]);
                        break;
                    case "1":
                        coordinateX -= Integer.parseInt(inputArray[1]);
                        break;
                    case "2":
                        coordinateY -= Integer.parseInt(inputArray[1]);
                        break;
                    case "3":
                        coordinateY += Integer.parseInt(inputArray[1]);
                        break;
                    default:
                        System.out.println("Wrong coordinates");
                }
            }
            if (coordinateX == 0 && coordinateY == 0) {
                System.out.println("studnia");
            } else {
                if (coordinateX > 0) {
                    System.out.println(0 + " " + coordinateX);
                } else if (coordinateX < 0) {
                    System.out.println(1 + " " + Math.abs(coordinateX));
                }
                if (coordinateY > 0) {
                    System.out.println(3 + " " + coordinateY);
                } else if (coordinateY < 0) {
                    System.out.println(2 + " " + Math.abs(coordinateY));
                }
            }
        }

    }
}
