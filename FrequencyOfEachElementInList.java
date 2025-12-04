/**
 * -------------------------------------------------------------
 *  Program Name : FrequencyOfEachElementInList
 *  Description  : This program accepts a list of integers from the user
 *                 and calculates how many times each element appears.
 *                 It uses a HashMap to store element-frequency pairs.
 *
 *  Author       : Pooja Kadam
 * -------------------------------------------------------------
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachElementInList {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user how many elements they want to enter
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Terminate the program if user enters 0
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create a list to store user input values
            List<Integer> list = new ArrayList<Integer>();

            System.out.println("Enter " + num + " elements:");

            // Read numbers from user and store them in the list
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }

            // HashMap to store each element and its frequency
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();

            /**
             * Loop through the list:
             * - If the element already exists in the map, increase its count
             * - Otherwise, add it with count = 1
             *
             * getOrDefault(key, defaultValue):
             * Returns the value of key if present, else returns defaultValue.
             */
            for (int number : list) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }

            // Display all elements with their frequencies
            System.out.println("Frequency of each element:");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            System.out.println(); // Blank line for better readability
        }
    }
}
