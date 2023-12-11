package org.example;

public class Fack {
    public static void main(String[] args){
        int n=400;
        System.out.println(getFack(n));
    }
    public static Double getFack(Integer n){
        if (n==0) return 1.0;
        if (n==1) return 1.0;
        return n*getFack(n-1);
    }
}
