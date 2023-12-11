package org.example;


import java.io.File;

class Main {
    public static void main(String[] args) {
        Main main=new Main();
        File file =new File("D:\\Projects");
        System.out.println(file.exists());

        System.out.println(getSize(file));


    }
    public  static long getSize(File file){
        if (file.isFile())return file.length();
        File[] files=file.listFiles();
        long sum=0;
        for (File file1 : files) {
            sum+=getSize(file1);
        }
        return sum;
    }
}