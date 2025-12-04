/**
 * Program to find all duplicate elements from a List using HashSet.
 * 
 * Description:
 *  - The user enters 'n' elements.
 *  - The program stores each element into a List.
 *  - A Set named 'seen' tracks elements encountered for the first time.
 *  - A Set named 'duplicateElement' collects elements that appear more than once.
 *  - If adding an element to 'seen' fails (returns false), it means the element is duplicate.
 * 
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AllDuplicateElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Asking user for number of elements
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Creating a list to store user inputs
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter " + num + " elements:");

            // Adding elements to the list
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }

            // Set to store duplicate elements
            Set<Integer> duplicateElement = new HashSet<>();

            // Set to check if element appeared before
            Set<Integer> seen = new HashSet<>();

            System.out.println("All duplicate elements in the list:");

            /*
             * Logic:
             * seen.add(num1) → returns true if num1 is not already present
             *                   returns false if num1 is already present (duplicate)
             * 
             * !seen.add(num1) → true means element was already present → duplicate
             */
            for (int num1 : list) {
                if (!seen.add(num1)) {       // If element already seen earlier
                    duplicateElement.add(num1); // Add to duplicateElements set
                }
            }

            // Printing the duplicate elements
            System.out.println("Duplicate elements are: " + duplicateElement);
        }
    }
}
