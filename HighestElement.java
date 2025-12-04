/**
 * Description:
 * This program accepts a list of integers from the user and finds the highest element.
 * The user specifies how many numbers they want to enter.
 * The list is sorted using Collections.sort(), and the last element is taken as the highest.
 * The program continues until the user enters 0 to stop.
 *
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HighestElement {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user how many elements they want to enter
            System.out.println("Enter the number of elements (or type 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create a list to store user inputs
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter " + num + " elements:");

            // Read numbers from user and add to list
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }

            // Sort the list in ascending order
            Collections.sort(list);

            // The last element after sorting is the highest
            int highest = list.get(list.size() - 1);

            // Display the highest number
            System.out.println("The highest element in the list is: " + highest);
            System.out.println("------------------------------------------\n");
        }
    }
}
