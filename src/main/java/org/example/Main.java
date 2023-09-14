package org.example;

import java.util.Arrays;

public class Main {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = "";
        String b = "";
        for (String s:word1){
            a+=s;
        }
        for (String w:word2){
            b+=w;
        }
      return  a.equals(b);

    }

    public static void main(String[] args) {
        Main main = new Main();
        String[] a={"ab", "c"};
        String[] b={"a", "bc"};
        System.out.println(main.arrayStringsAreEqual(a,b));


    }
}