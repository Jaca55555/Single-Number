package org.example;

public class Main {
    public boolean threeConsecutiveOdds(int[] arr) {
        for (int i = 1; i <arr.length-1 ; i++) {
            if (arr[i-1]%2==1&&arr[i]%2==1&&arr[i+1]%2==1){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {2,6,4,1};
        System.out.println(main.threeConsecutiveOdds(a));


    }
}