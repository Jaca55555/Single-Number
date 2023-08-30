package org.example;

public class Main {
    public int alternateDigitSum(int n) {
        int a = 0;
        int sum = 0, i = 1;
        do {
            a = n % 10;
            n = n / 10;
            i++;
            sum += Math.pow(-1, i) * a;
        } while (n > 0);
        return i % 2 == 0 ? sum : -sum;

    }

    public static void main(String[] args) {
        Main main = new Main();
        int a = 521;
        System.out.println(main.alternateDigitSum(a));


    }
}