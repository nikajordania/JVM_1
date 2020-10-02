package com.company;

public class Main {

    public static void main(String[] args) {
        ClassA object1 = new ClassA();
        object1.Method1();
        object1.Method2();
        System.out.println("Sum of multiplication: " + object1.Method3());

        ClassB object2 = new ClassB();
        object2.Method1();
        object2.Method2();
        System.out.println("Min number is: " + object2.Method3());

        ClassC object3 = new ClassC();
        object3.Method1();
        System.out.println("Last digit of number a is: " + object3.Method2());
        System.out.println("First digit of number b is: " + object3.Method3());
        System.out.println("Sum digits of number b is: " + object3.Method4());
        System.out.println("sum of method 1 and method 2: " + object3.Method5());
        System.out.println("sum of method 3 and method 5" + object3.Method6());

    }
}
