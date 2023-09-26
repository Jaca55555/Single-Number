package org.example;


import java.util.Arrays;

class Main {
    public int getMaximumGenerated(int n) {
        int[] nums=new int[n+1];
        if(n==0) return 0;
        nums[0]=0;
        nums[1]=1;
        nums[2]=1;
        int max=1;
        if (n>2) {
            for (int i = 1; i <= n / 2; i++) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
                if (max < nums[2 * i + 1]) max = nums[2 * i + 1];
            }
        }return max;
    }

    public static void main(String[] args) {
        Main main=new Main();
        int n=2;
        System.out.println(main.getMaximumGenerated(n));



    }
}