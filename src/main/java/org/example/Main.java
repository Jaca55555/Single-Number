package org.example;
//A=65

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public boolean isHappy(int n) {
           int a=n;
           int b=n;
           do {
               a=square(a);
               b=square(square(b));
           }while (a!=b);
           return a==1;

    }
    public int square(int num) {

        int ans = 0;

        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int n=19;
        System.out.println(main.isHappy(n));


    }
}