package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> list=new ArrayList<>(rowIndex+1);
        list.add(0,1);
        for (int i = 1; i <= rowIndex; ++i) {
            list.add(1);
            for (int j = i-1; j >0 ; --j) {
                list.set(j,list.get(j)+list.get(j-1));
            }

        }return list;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int a=4;
        System.out.println(main.getRow(a));


    }
}