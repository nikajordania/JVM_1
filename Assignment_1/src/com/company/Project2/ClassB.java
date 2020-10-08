package com.company.Project2;

public class ClassB extends ClassA {
    int y;

    public void Method4() {
        System.out.print("Input integer y: ");
        y = input.nextInt();
        System.out.printf("y = %d\n", y);
    }

    public void Method5() {
        System.out.println("sum of x and y = " + (x + y));
    }
}