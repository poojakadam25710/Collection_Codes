/**
 * Program to read elements from the user and store them in a TreeSet
 * so that the elements automatically get sorted.
 * The program continues until the user enters 0.
 * 
 * Author: Your Name
 */

package com.basic.collectionCodes;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {

    public static void main(String[] args) {

        // Scanner object is used to take user input from the console
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Asking user for number of elements
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // If user enters 0 → exit program
            if (num == 0) {
                System.out.println("Program ended.");
                sc.close(); // Closing scanner to avoid memory leaks
                break;
            }

            // TreeSet stores elements in sorted (ascending) order automatically
            Set<Integer> set = new TreeSet<>();

            System.out.println("Enter " + num + " elements:");

            // Reading elements and adding to TreeSet
            for (int i = 0; i < num; i++) {
                set.add(sc.nextInt());
            }

            // Display sorted elements
            System.out.println("The sorted elements are: " + set);
            System.out.println("-----------------------------------");
        }
    }
}
