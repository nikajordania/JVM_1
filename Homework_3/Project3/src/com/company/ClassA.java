package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassA {
    int[] m = new int[10];

    public void method1() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < m.length; i++) {
            System.out.print("Input number of array " + (i + 1) + ": ");
            m[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(m));
    }

    public void method2() {
        for (int i = 0; i < m.length; i++) {
            m[i] = new Random().nextInt(16);

        }
        System.out.println(Arrays.toString(m));
    }

    public void method3() {
        int[] less = new int[m.length];
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < i)
                less[i] = m[i];
        }
        for (int j : less) {
            sum += j;
        }
        System.out.println("sum of less array: " + sum);
    }

}
