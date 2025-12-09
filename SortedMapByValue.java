/**
 * Program Name: SortedMapByValue
 * Description: This program accepts key-value pairs from the user,
 *              sorts the map by values in ascending order,
 *              and prints the sorted result.
 * 
 * Author: (Add your name here)
 */

package com.basic.collectionCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortedMapByValue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            // Ask the user how many entries to add
            System.out.println("Enter the number of elements (or enter 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended");
                sc.close();
                break;
            }

            // Create a map to store user-entered key-value pairs
            Map<String, Integer> map = new HashMap<>();

            // Loop to read keys and values
            for (int i = 0; i < num; i++) {

                System.out.println("Enter a key:");
                String key = sc.next();

                System.out.println("Enter a value:");
                int value = sc.nextInt();

                map.put(key, value);
            }

            // Convert map entries to a List for sorting
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            // Sort the list based on values using Comparator
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

                @Override
                public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }
            });

            // Print the sorted map values
            System.out.println("Sorted map by values:");
            for (Map.Entry<String, Integer> sortedValue : list) {
                System.out.println(sortedValue.getKey() + " -> " + sortedValue.getValue());
            }

            System.out.println();
        }
    }
}
