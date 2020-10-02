package com.company;

public class Main {

    public static void main(String[] args) {
        ClassA object1 = new ClassA();
        object1.method1();
        object1.method2();
        object1.method3();

        ClassB object2 = new ClassB();
        object2.method1();
        object2.method2();
        object2.method3();
        System.out.println("Range of max an min: " + object2.method4());
    }
}
