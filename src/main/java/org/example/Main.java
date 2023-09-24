package org.example;


import java.util.ArrayList;
import java.util.List;

class Main {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        System.out.println();
        return c;
    }

    public static void main(String[] args) {

        Main main = new Main();
        String a="abcd";
        String b="abcde";
        System.out.println(main.findTheDifference(a,b));
    }
}