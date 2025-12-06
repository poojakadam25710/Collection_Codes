/**
 * This program demonstrates how to compute the Union and Intersection 
 * of two sets entered by the user. It repeatedly accepts input until 
 * the user enters 0 to stop.
 * Author: Pooja kadam
 */

package com.basic.collectionCodes;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersectionOfSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for number of elements
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;  // Missing earlier, necessary to stop loop
            }

            // Create two sets to store user input
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();

            // Read elements for first set
            System.out.println("Enter " + num + " elements for the first set:");
            for (int i = 0; i < num; i++) {
                set1.add(sc.nextInt());
            }

            // Read elements for second set
            System.out.println("Enter " + num + " elements for the second set:");
            for (int i = 0; i < num; i++) {
                set2.add(sc.nextInt());
            }

            // Compute union (all elements from both sets)
            Set<Integer> union = new HashSet<>(set1);
            union.addAll(set2);

            // Compute intersection (common elements only)
            Set<Integer> intersection = new HashSet<>(set1);
            intersection.retainAll(set2);

            // Display results
            System.out.println("Union of the two sets: " + union);
            System.out.println("Intersection of the two sets: " + intersection);
            System.out.println();
        }
    }
}
