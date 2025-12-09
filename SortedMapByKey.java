/**
 * Program Name: SortedMapByKey.java
 * Package: com.basic.collectionCodes
 *
 * Description:
 * This program takes key-value pairs from the user and stores them in a Map.
 * It then sorts the Map by its keys in ascending order using a custom Comparator.
 * Finally, it prints the sorted map entries.
 *
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SortedMapByKey {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter the number of key-value pairs (or enter 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended.");
                sc.close();
                break;
            }

            // Create a map to store key-value pairs
            Map<String, Integer> map = new HashMap<>();

            // Take input from user
            for (int i = 0; i < num; i++) {
                System.out.println("Enter a key:");
                String key = sc.next();

                System.out.println("Enter a value:");
                int value = sc.nextInt();

                map.put(key, value);
            }

            // Convert map entries to a list
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            // Sort the list by keys using Comparator
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

                @Override
                public int compare(Map.Entry<String, Integer> o1,
                                   Map.Entry<String, Integer> o2) {

                    // Compare keys alphabetically
                    return o1.getKey().compareTo(o2.getKey());
                }
            });

            // Print sorted entries
            System.out.println("Sorted Map By Keys:");
            for (Map.Entry<String, Integer> sortedEntry : list) {
                System.out.println(sortedEntry.getKey() + " -> " + sortedEntry.getValue());
            }

            System.out.println("---------------------------------\n");
        }
    }
}
