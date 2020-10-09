package com.company;

import com.company.Project1.ClassC;
import com.company.Project2.ClassB;
import com.company.Project3.ClassRandom;

public class Main {

    public static void main(String[] args) {
        ClassC obj_1 = new ClassC();

        obj_1.Method1();
        System.out.println("Last digit of number a is: " + obj_1.Method2());
        System.out.println("First digit of number b is: " + obj_1.Method3());
        System.out.println("Sum digits of number c is: " + obj_1.Method4());
        System.out.println("Sum of Method2 * Method3: " + obj_1.Method5());
        System.out.println("Sum of Method3 + Method5: " + obj_1.Method6());


        ClassB obj_2 = new ClassB();

        obj_2.Method1();
        obj_2.Method2();
        obj_2.Method3();
        obj_2.Method4();
        obj_2.Method5();

        ClassRandom obj_3 = new ClassRandom();
        obj_3.Input();
    }
}
