/**
 * Program to find the Maximum and Minimum values from a list
 * WITHOUT using Collections.max() or Collections.min().
 * The user can repeat the process until they enter 0.
 * 
 * Author: pooja kadam
 */
package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMinWithoutCollectionsMethod {

    public static void main(String[] args) {

        // Scanner object used to take input from the user
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Asking user how many elements they want to enter
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // If user enters 0 → exit the program
            if (num == 0) {
                System.out.println("Program ended.");
                
                // Closing Scanner object to avoid memory leak
                sc.close();
                break;
            }

            // List to store user-input numbers
            List<Integer> list = new ArrayList<>();

            System.out.println("Enter " + num + " elements:");

            // Reading list elements from user
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }

            // Initialize min and max with the first element of the list
            int min = list.get(0);
            int max = list.get(0);

            // Loop through the list to find min and max manually
            for (int value : list) {

                // If the current value is greater than max → update max
                if (value > max) {
                    max = value;
                }

                // If the current value is smaller than min → update min
                if (value < min) {
                    min = value;
                }
            }

            // Display results
            System.out.println("Maximum number is: " + max);
            System.out.println("Minimum number is: " + min);
            System.out.println("----------------------------\n");
        }
    }
}
