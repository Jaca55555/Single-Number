package org.example;

public class Main {
    public int countNegatives(int[][] grid) {
        int sum=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
               if (grid[i][j]<0)sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[][] a={{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        System.out.println(main.countNegatives(a));


    }
}