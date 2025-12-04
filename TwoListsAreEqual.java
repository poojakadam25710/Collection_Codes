/**
 * Program Name   : TwoListsAreEqual
 * Description    : This program checks whether two lists entered by the user 
 *                  contain the same elements in the same order.
 * Author         : Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoListsAreEqual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for number of elements
            System.out.println("Enter number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // If user enters 0 → exit program
            if (num == 0) {
                System.out.println("Program ended.");
                sc.close();
                break;
            }

            // Creating two lists
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            // -------------------- INPUT FOR FIRST LIST --------------------
            System.out.println("Enter " + num + " elements for the first list:");
            for (int i = 0; i < num; i++) {
                list1.add(sc.nextInt());
            }

            // -------------------- INPUT FOR SECOND LIST --------------------
            System.out.println("Enter " + num + " elements for the second list:");
            for (int i = 0; i < num; i++) {
                list2.add(sc.nextInt());
            }

            // Copy first list to compare with second list
            List<Integer> equalList = new ArrayList<>(list1);

            // -------------------- COMPARISON --------------------
            // equals() checks same size, same order, same elements
            if (equalList.equals(list2)) {
                System.out.println("Lists are equal.");
            } else {
                System.out.println("Lists are NOT equal.");
            }
        }
    }
}
