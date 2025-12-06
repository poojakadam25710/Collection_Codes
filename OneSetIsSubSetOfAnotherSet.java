/**
 * Program to check whether one set is a subset of another set.
 * Author: <Your Name>
 */

package com.basic.collectionCodes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class OneSetIsSubSetOfAnotherSet {

    public static void main(String[] args) {

        // Scanner object is created to take input from the user via keyboard (System.in)
        // It allows reading integers, strings, etc. from console
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for number of elements in first set
            System.out.println("Enter the number of elements in first set (or enter 0 to stop):");
            int num1 = sc.nextInt();  // Read integer input entered by user

            // Ask user for number of elements in second set
            System.out.println("Enter the number of elements in second set (or enter 0 to stop):");
            int num2 = sc.nextInt();  // Read integer input entered by user

            // Exit condition
            if (num1 == 0 || num2 == 0) {
                System.out.println("Program ended");

                // Closing the scanner to prevent resource leakage
                // Good practice to close once scanner is no longer needed
                sc.close();
                break;
            }

            // Declaring two sets for comparison
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            // Read elements for the first set
            System.out.println("Enter " + num1 + " elements for the first set:");
            for (int i = 0; i < num1; i++) {
                set1.add(sc.nextInt());  // Taking set elements using scanner
            }

            // Read elements for the second set
            System.out.println("Enter " + num2 + " elements for the second set:");
            for (int i = 0; i < num2; i++) {
                set2.add(sc.nextInt());  // Taking set elements using scanner
            }

            // containsAll() checks whether every element of set1 exists in set2
            boolean isSubset = set2.containsAll(set1);

            // Display result
            if (isSubset) {
                System.out.println("Set1 is a subset of Set2");
            } else {
                System.out.println("Set1 is NOT a subset of Set2");
            }
        }
    }
}
