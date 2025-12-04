/**
 * Program Name: RemoveDuplicatesFromList.java
 * Package: com.basic.collectionCodes
 *
 * Description:
 * This program removes duplicate elements from a user-entered list.
 * The user enters 'n' elements, which are stored in an ArrayList.
 * A LinkedHashSet is then used to remove duplicates while maintaining insertion order.
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user how many elements they want to enter
            System.out.println("Enter number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Stop condition
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create list to store numbers
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter " + num + " elements:");

            // Read user inputs into list
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }

            // Use LinkedHashSet to remove duplicates while preserving order
            Set<Integer> uniqueElements = new LinkedHashSet<>(list);

            // Display result
            System.out.println("Elements after removing duplicates: " + uniqueElements);
            System.out.println("-----------------------------------------\n");
        }
    }
}
