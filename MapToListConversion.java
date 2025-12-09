/**
 * Program to convert a Map into two separate Lists:
 * one list for Keys and one list for Values.
 * The user enters multiple key-value pairs and
 * the program continues until they enter 0.
 * 
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapToListConversion {

    public static void main(String[] args) {

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask how many entries user wants to add
            System.out.println("Enter the number of key-value pairs (or type 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended.");
                sc.close();
                break;
            }

            // Creating a HashMap to store key-value pairs
            Map<String, Integer> map = new HashMap<>();

            // Taking key-value input from user
            for (int i = 0; i < num; i++) {

                System.out.println("Enter a key:");
                String key = sc.next();  // reading String key

                System.out.println("Enter a value:");
                int value = sc.nextInt();  // reading integer value

                // Putting key-value pair into map
                map.put(key, value);
            }

            // Convert map keys to a list
            List<String> keyList = new ArrayList<>(map.keySet());

            // Convert map values to a list
            List<Integer> valueList = new ArrayList<>(map.values());

            // Print results
            System.out.println("List of Keys: " + keyList);
            System.out.println("List of Values: " + valueList);
            System.out.println("---------------------------------\n");
        }
    }
}
