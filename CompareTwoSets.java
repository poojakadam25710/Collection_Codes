/**
 * This program compares two sets entered by the user and checks
 * whether both sets contain the same elements.
 * 
 * Author: Your Name
 */

package com.basic.collectionCodes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CompareTwoSets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for number of elements
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Terminate program if user enters 0
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create two sets
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            // Input elements for first set
            System.out.println("Enter " + num + " elements for the first set:");
            for (int i = 0; i < num; i++) {
                set1.add(sc.nextInt());
            }

            // Input elements for second set
            System.out.println("Enter " + num + " elements for the second set:");
            for (int i = 0; i < num; i++) {
                set2.add(sc.nextInt());
            }

            // Check if sets are equal
            boolean isEqual = true;

            // First check size
            if (set1.size() != set2.size()) {
                isEqual = false;
            }

            // Then check actual element equality
            if (!set1.equals(set2)) {
                isEqual = false;
            }

            // Print result
            if (isEqual) {
                System.out.println("Two sets are equal");
            } else {
                System.out.println("Two sets are not equal");
            }
        }
    }
}
