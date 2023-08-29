package org.example;

public class Main {
    public boolean squareIsWhite(String coordinates) {
        char[] chars=new char[2];
        chars[0]=coordinates.charAt(0);
        chars[1]=coordinates.charAt(1);
       return chars[0] % 2 == 1 && chars[1] % 2 == 0 || chars[0] % 2 == 0 && chars[1] % 2 == 1;
    }


    public static void main(String[] args) {
        Main main = new Main();
        String a="c7";
        System.out.println(main.squareIsWhite(a));



    }
}