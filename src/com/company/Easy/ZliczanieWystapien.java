package com.company.Easy;

import java.util.Scanner;

public class ZliczanieWystapien {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            int counter = 0;
            String[] inputArray = input.split(" ");
            for (int i = 0; i < Integer.valueOf(inputArray[1]); i++) {
                if (inputArray[i + 2].equals(inputArray[0])) {
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
