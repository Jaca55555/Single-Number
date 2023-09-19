package org.example;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Date;

class Main {

    public static void main(String[] args) {
        int[] mass=new int[1000];
        for (int i = 0; i < mass.length; i++) {
            mass[i]=(int) Math.random()*1000;
        }
        for (int i = 0; i < mass.length-1; i++) {
            int mainIndex=i;
            for (int j = i+1; j <mass.length-1 ; j++) {
                if (mass[j]<mass[mainIndex]){
                    mainIndex=j;
                }
            }
            int temp=mass[i];
            mass[i]=mass[mainIndex];
            mass[mainIndex]=temp;
        }

    }
}