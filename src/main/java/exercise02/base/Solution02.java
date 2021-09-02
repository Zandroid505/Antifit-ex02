package exercise02.base;
/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Zakaria Antifit
 */

import java.util.Scanner;

public class Solution02 {
    /*
     * print "What is the input string?"
     * 'str' = user input string
     * 'len' = Use length object to count characters in 'str'
     * print "'str' has 'length' characters."
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String str = input.nextLine();

        int len = str.length();
        System.out.printf("%s has %d characters.", str, len);
    }
}
