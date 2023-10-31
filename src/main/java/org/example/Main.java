package org.example;


import java.util.Arrays;
import java.util.Comparator;

class Main {
    public String largestNumber(int[] nums) {
        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numsStr, new Comparator<String>() {
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ba.compareTo(ab);
            }
        });
        if (numsStr[0].equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        for (String num : numsStr) {
            result.append(num);
        }
        return result.toString();

    }
    // add LinkedList>ArrayList


    public static void main(String[] args) {
        Main main = new Main();
        int[] nums={1,100,1101,92,2,3};
        String b="aab";
        System.out.println(main.largestNumber(nums));


    }
}