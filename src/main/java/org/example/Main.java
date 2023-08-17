package org.example;
//A=65

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public String[] sortPeople(String[] names, int[] heights) {

        String  max;
        int maInt;
        for (int i = 0; i <heights.length ; i++) {
            for (int j = i+1; j <heights.length ; j++) {
                if (heights[i]<heights[j]){
                    maInt=heights[i];
                    heights[i]=heights[j];
                    heights[j]=maInt;
                    max=names[i];
                    names[i]=names[j];
                    names[j]=max;
                }
            }
        }
        return names;
        
    }
    public static void main(String[] args) {
        Main main = new Main();

        String [] names={"Mary","John","Emma"};
        int[] heights={180,165,170};
        System.out.println(main.sortPeople(names,heights));


    }
}