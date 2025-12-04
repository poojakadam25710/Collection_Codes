/**
 * Description:
 * This program merges two lists entered by the user. 
 * The user first enters how many elements will be added to each list.
 * Both lists are created using ArrayList and filled with user input.
 * While merging, duplicate elements from the second list are avoided 
 * by checking if they already exist in the merged list.
 * The program continues until the user enters 0 to stop.
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for number of elements
            System.out.println("Enter number of elements (or type 0 to stop):");
            int num1 = sc.nextInt();

            // Exit condition
            if (num1 == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create two lists
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            // Read elements for first list
            System.out.println("Enter " + num1 + " elements for the FIRST list:");
            for (int i = 0; i < num1; i++) {
                list1.add(sc.nextInt());
            }

            // Read elements for second list
            System.out.println("Enter " + num1 + " elements for the SECOND list:");
            for (int i = 0; i < num1; i++) {
                list2.add(sc.nextInt());
            }

            // Create merged list and initialize with list1
            List<Integer> mergedList = new ArrayList<>(list1);

            // Add elements from list2 only if they do not already exist
            for (int number : list2) {
                if (!mergedList.contains(number)) {
                    mergedList.add(number);
                }
            }

           /* // Display merged list
            System.out.println("Merged List (without duplicates): " + mergedList);
            System.out.println("---------------------------------------------\n");*/
            
           
            //Merging allowed the duplicates
            mergedList.addAll(list2);
            
            // Display merged list
            System.out.println("Merged List (duplicates allowed): " + mergedList);
            System.out.println("-----------------------------------------\n");
        }
    }
}
