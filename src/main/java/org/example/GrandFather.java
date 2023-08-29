package org.example;

public class GrandFather extends ChilderInterface {
   int age;
   String name;

    public GrandFather(String name1) {
        super(name1);
    }
//   final String name1;

//    public GrandFather(String name1) {
//        this.name1 = name1;
//    }
    static  void getAge(){
        System.out.println("GrandFaather");
    }

   public static  void getName(){
        System.out.println("GrandFaather Name");
    }
}
