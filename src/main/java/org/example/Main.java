package org.example;
//A=65

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();

        for (int num : nums) {
            numCountMap.put(num, numCountMap.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (numCountMap.get(num) == 1) {
                return num;
            }
        }

        return -1;


    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] a={4,1,2,1,2};
        System.out.println(main.singleNumber(a));


    }
}