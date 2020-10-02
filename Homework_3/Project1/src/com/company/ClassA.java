package com.company;

import java.util.Scanner;

public class ClassA {
    int a, b;

    public void Method1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number a: ");
        a = input.nextInt();
        System.out.print("Input number b: ");
        b = input.nextInt();
    }

    public void Method2() {
        System.out.println("Sum of a and b is: " + (a + b));
    }

    public int Method3() {
        return a * b;
    }
}
