/**
 * This program demonstrates how to convert a List to a Set and then convert
 * the Set back to a List. It repeatedly takes user input to perform the operations.
 * Author: pooja kadam
 */
package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ConvertListToSetAndSetToList {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for number of elements
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Termination condition
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create a list to store input elements
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter " + num + " elements for the list:");

            // Accept list elements from the user
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }

            // Convert List to Set to remove duplicates
            Set<Integer> set = new HashSet<>(list);
            System.out.println("Converted list into set: " + set);

            // Convert Set back to List
            List<Integer> list1 = new ArrayList<>(set);
            System.out.println("Converted set back into list: " + list1);
        }
    }
}
