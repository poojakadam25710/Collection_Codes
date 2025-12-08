/**
 * Program to add key-value pairs into a Map using Scanner
 * and display all the map entries.
 * 
 * Author: Pooja kadam
 */

package com.basic.collectionCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddDisplayMap {

    public static void main(String[] args) {

        // Scanner object used to read user input from keyboard
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask user how many map entries should be added
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();   // Reads integer input

            // Condition to exit program
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();           // Closing Scanner to prevent resource leak
                break;
            }

            // HashMap to store key-value pairs
            Map<String, Integer> map = new HashMap<>();

            // Take key-value pairs from user
            for (int i = 0; i < num; i++) {

                // Reading key input as String
                System.out.println("Enter a key:");
                String key = sc.next();  // Reads a single word as key

                // Reading value input as integer
                System.out.println("Enter a value:");
                int value = sc.nextInt();  // Reads integer value

                // Adding the key-value pair into the map
                map.put(key, value);
            }

            // Displaying all map entries
            System.out.println("Map entries are:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

            System.out.println(); // Blank line for readability
        }
    }
}
