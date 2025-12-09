/**
 * Program to merge two maps entered by the user.
 * If both maps contain the same key, the value from the second map
 * will overwrite the value from the first map.
 * 
 * Author: Pooja Kadam
 */

package com.basic.collectionCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergedMap {

    public static void main(String[] args) {

        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        while (true) {

            // ---------------- FIRST MAP INPUT ----------------
            System.out.println("Enter the number of entries for the FIRST map (or enter 0 to stop):");
            int num = sc.nextInt();

            // Exit condition
            if (num == 0) {
                System.out.println("Program ended.");
                sc.close();
                break;
            }

            // Creating first map
            Map<String, Integer> map1 = new HashMap<>();

            // Reading key-value pairs for first map
            for (int i = 0; i < num; i++) {
                System.out.println("Enter key for Map 1:");
                String key = sc.next();

                System.out.println("Enter value for Map 1:");
                int value = sc.nextInt();

                map1.put(key, value);
            }

            // ---------------- SECOND MAP INPUT ----------------
            System.out.println("Enter the number of entries for the SECOND map:");
            int num2 = sc.nextInt();

            // Exit condition for second map's count
            if (num2 == 0) {
                System.out.println("Program ended.");
                sc.close();
                break;
            }

            // Creating second map
            Map<String, Integer> map2 = new HashMap<>();

            // Reading key-value pairs for second map
            for (int i = 0; i < num2; i++) {
                System.out.println("Enter key for Map 2:");
                String key = sc.next();

                System.out.println("Enter value for Map 2:");
                int value = sc.nextInt();

                map2.put(key, value);
            }

            // ---------------- MERGING BOTH MAPS ----------------
            // First copy map1 into merged map
            Map<String, Integer> mergedMap = new HashMap<>(map1);

            // Add all entries of map2 (overwrites duplicates)
            mergedMap.putAll(map2);

            // Display merged map
            System.out.println("Merged Map is: " + mergedMap);
            System.out.println("-----------------------------------\n");
        }
    }
}
