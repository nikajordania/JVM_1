package com.company.Project2;

import java.util.Scanner;

public class ClassA {
    int x;
    Scanner input = new Scanner(System.in);

    public ClassA() {
        System.out.println("Hello\n");
    }

    public void Method1() {
        System.out.print("Input integer x: ");
        x = input.nextInt();
        System.out.printf("x = %d\n", x);
    }

    public void Method2() {
        System.out.printf("x + 12 = %d\n", (x + 12));
    }

    public void Method3() {
        if (x % 2 == 0)
            System.out.printf("Number %d is even\n", x);
        else
            System.out.printf("Number %d is odd\n", x);
    }

}
