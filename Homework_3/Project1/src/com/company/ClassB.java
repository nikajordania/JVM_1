package com.company;

import java.util.Scanner;

public class ClassB {
    int a, b, c;

    public void Method1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number a: ");
        a = input.nextInt();
        System.out.print("Input number b: ");
        b = input.nextInt();
        System.out.print("Input number c: ");
        c = input.nextInt();
    }

    public void Method2() {
        int[] numbers = new int[]{a, b, c};
        int max = 0;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Max number is: " + max);
    }

    public int Method3() {
        int[] numbers = new int[]{a, b, c};
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
