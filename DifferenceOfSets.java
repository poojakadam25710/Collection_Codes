/**
 * This program calculates the difference between two sets entered by the user.
 * It subtracts all elements of the second set from the first set (set1 - set2)
 * and displays the resulting set difference.
 * 
 * Author: Your Name
 */

package com.basic.collectionCodes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DifferenceOfSets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for number of elements
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Stop the program if user enters 0
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create two sets for user input
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            // Input elements for the first set
            System.out.println("Enter " + num + " elements for the first set:");
            for (int i = 0; i < num; i++) {
                set1.add(sc.nextInt());
            }

            // Input elements for the second set
            System.out.println("Enter " + num + " elements for the second set:");
            for (int i = 0; i < num; i++) {
                set2.add(sc.nextInt());
            }

            // Create a new set to store the difference (copy of set1)
            Set<Integer> difference = new HashSet<>(set1);

            // Remove all elements of set2 from the copy of set1
            difference.removeAll(set2);

            // Display the result
            System.out.println("Difference (set1 - set2): " + difference);
            System.out.println();
        }
    }
}
