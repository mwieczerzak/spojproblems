package com.company.eLeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Wiatraczki {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input;
        do {
            input = Integer.valueOf(reader.readLine());
            for (int i = 0; i < Math.abs(input) * 2 - 1; i++) {
                if (input > 0) {
                    if (i > 0 && i < input) {
                        System.out.print(".");
                    } else {
                        System.out.print("*");
                    }
                } else if (input < 0) {
                    if (i >= Math.abs(input)) {
                        System.out.print(".");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            for (int j = 0; j < Math.abs(input) * 2 - 1; j++) {
                if (input > 0) {
                    if (j > 0 && j < input) {
                        System.out.println(".");
                    } else {
                        System.out.println("*");
                    }
                } else if (input < 0) {
                    if (j >= Math.abs(input)) {
                        System.out.println(".");
                    } else {
                        System.out.println("*");
                    }
                }
                for (int k = 0; k < Math.abs(input) * 2 - 1; k++) {
                    if (input > 0) {
                        if ((k >= input && k <= j) ||
                                (k < input && k > j + 1) ||
                                (k > input * 2 - 2 - j && j < input - 1) ||
                                (k < input * 2 - 2 - j && j > input - 2)) {
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                    } else if (input < 0) {
                        if ((k <= j && j < Math.abs(input) - 1) ||
                                (k > j + 1 && j >= Math.abs(input) - 1) ||
                                (k >= Math.abs(input) && k < Math.abs(input) * 2 - 2 - j && j < Math.abs(input) - 2) ||
                                (k > Math.abs(input) * 2 - j - 2 && k < Math.abs(input) && j >= Math.abs(input))) {
                            System.out.print(".");
                        } else {
                            System.out.print("*");
                        }
                    }
                }
            }
            if (input != 0) System.out.println("*");
            System.out.println();
        }
        while (input != 0);

    }
}
