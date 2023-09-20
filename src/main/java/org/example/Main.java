package org.example;

import java.util.Arrays;

 class Main {
     public boolean canMakeArithmeticProgression(int[] arr) {

         boolean t = true;
         Arrays.sort(arr);

         for (int i = 0; i < arr.length - 2; i++) {
             int diff1 = Math.abs(arr[i] - arr[i+1]);
             int diff2 = Math.abs(arr[i+1] - arr[i+2]);

             if (diff1 != diff2) {
                 return false;
             }
         }

         return t;
     }

    public static void main(String[] args) {

        Main main = new Main();
        int[] arr={3,5,1};
        System.out.println(main.canMakeArithmeticProgression(arr));
    }
}