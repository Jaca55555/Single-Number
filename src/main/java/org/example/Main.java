package org.example;
//A=65

import java.util.*;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public double myPow(double x, int n) {
        return Math.pow(x,n);

    }
    public static void main(String[] args) {
        Main main = new Main();
        double x=2.00000;
        int n=10;
        System.out.println(main.myPow(x,n));


    }
}