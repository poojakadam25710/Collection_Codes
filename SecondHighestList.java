/**
 * Description:
 * This program finds the second highest element from a list of integers.
 * The user enters how many elements they want to input. After reading the numbers,
 * the list is sorted in ascending order using Collections.sort().
 * The second highest value is then taken from the second last position in the list.
 * If the list contains fewer than 2 elements, the program displays an appropriate message.
 * The program repeats until the user enters 0 to stop.
 *
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondHighest {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user how many elements they want to enter
            System.out.println("Enter the number of elements (or type 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended");
                break;
            }

            // Create a list to store the elements
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter " + num + " elements:");

            // Read elements into the list
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }

            // Sort the list in ascending order
            Collections.sort(list);

            // Check if list contains at least two elements
            if (list.size() < 2) {
                System.out.println("Not enough elements to find second highest number.");
                continue;  // Skip to next iteration
            }

            // Second highest is the element before the last one
            int secondHighest = list.get(list.size() - 2);

            // Display result
            System.out.println("The second highest element in the list is: " + secondHighest);
            System.out.println("-------------------------------------------\n");
        }

        sc.close();
    }
}
