package org.example;

public class GrandFather {
    private  final String name;
    static  int age;
    int age2;
    int getAge2(int age2){
        return age2;
    }

    public GrandFather(String name) {
        this.name = name;
    }
    private String getA(){
        return name;
    }
    public static int  getB(){
        return age;
    }
    static void getAb(){
        System.out.println("ab");
    }
}
