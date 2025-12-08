/**
 * Program to find the highest and lowest values stored in a Map.
 *
 * Author: Pooja kadam
 */

package com.basic.collectionCodes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestElementMap {

    public static void main(String args[]) {

        // Scanner object used to read user input from the console
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user how many key-value pairs should be entered
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt(); // Reads number of entries

            // Program exit condition
            if (num == 0) {
                System.out.println("Program ended");
                sc.close(); // Closing Scanner to release resources
                break;
            }

            // HashMap to store key-value pairs
            Map<String, Integer> map = new HashMap<>();

            // Loop to take user inputs for map
            for (int i = 0; i < num; i++) {

                // Read the key from user input
                System.out.println("Enter a key:");
                String key = sc.next(); // Reads a single word as key

                // Read the value from user input
                System.out.println("Enter a value:");
                int value = sc.nextInt(); // Reads integer value

                // Store key-value pair in map
                map.put(key, value);
            }

            // Finding highest value using Collections.max()
            int max = Collections.max(map.values());

            // Finding lowest value using Collections.min()
            int min = Collections.min(map.values());

            // Display results
            System.out.println("The highest value is: " + max);
            System.out.println("The lowest value is: " + min);
        }
    }
}
