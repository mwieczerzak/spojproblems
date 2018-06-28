package com.company.Easy;

import java.util.Scanner;

/**
 * https://pl.spoj.com/problems/KC009/
 */

public class OdwracanieWyrazow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String word = sc.nextLine();
            String changedWord = "";
            for (int i = 0; i < word.length(); i++) {
                changedWord += word.charAt(word.length() - 1 - i);
            }
            System.out.println(changedWord);
        }
    }
}
