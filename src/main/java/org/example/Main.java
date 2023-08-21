package org.example;
public class Main {
    public void rob(int n) {
        int k = 0;
        int m = 2*n-1;
        int[][] a = new int[m][m];
        for (int i = 0; i < n; i++) {
            for (int j = k; j < m; j++) {
                for (int l = k; l < m; l++) {
                    a[j][l]=n-i;
                }
            }
            k++;
            m--;
        }
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        int a=7;
        main.rob(a);


    }
}