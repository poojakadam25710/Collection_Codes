/**
 * Description:
 * This program reverses a list of integers without using any built-in reverse method.
 * The user is prompted to enter the number of elements, then the elements themselves.
 * The program manually swaps the elements to reverse the list and displays the result.
 * The program continues to run until the user enters 0 to stop.
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseList {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Prompt user for number of elements
            System.out.println("Enter number of elements (or enter 0 to stop)");
            int numbers = sc.nextInt();

            // Exit condition
            if (numbers == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create list to store user input
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter " + numbers + " elements:");

            // Read elements from user
            for (int i = 0; i < numbers; i++) {
                list.add(sc.nextInt());
            }

            // Reverse list using two-pointer technique
            for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }

            // Display reversed list
            System.out.println("Reversed list: " + list);
            System.out.println("----------------------------------------\n");
        }
    }
}
