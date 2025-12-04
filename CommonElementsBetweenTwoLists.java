/**
 * -------------------------------------------------------------
 * Program Name : CommonElementsBetweenTwoLists
 * Description  : This program accepts two lists of integers from the user
 *                and finds the common elements between both lists.
 *                It checks each element of the first list and verifies 
 *                whether it exists in the second list.
 * Author       : Pooja Kadam
 * -------------------------------------------------------------
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElementsBetweenTwoLists {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user for number of elements to be entered in both lists
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create two lists to store user inputs
            List<Integer> list1 = new ArrayList<Integer>();
            List<Integer> list2 = new ArrayList<Integer>();

            // Accept elements of first list
            System.out.println("Enter " + num + " elements in the first list:");
            for (int i = 0; i < num; i++) {
                list1.add(sc.nextInt());
            }

            // Accept elements of second list
            System.out.println("Enter " + num + " elements in the second list:");
            for (int i = 0; i < num; i++) {
                list2.add(sc.nextInt());
            }

            // List to store common elements
            List<Integer> commonElements = new ArrayList<Integer>();

            // Compare each element of list1 with list2
            System.out.println("Common elements in both lists are:");
            for (int number : list1) {
                if (list2.contains(number)) {  // Check if number exists in list2
                    commonElements.add(number);
                }
            }

            // Display result
            System.out.println(commonElements);
            System.out.println("-------------------------------------\n");
        }
    }
}
