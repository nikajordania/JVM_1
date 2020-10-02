package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassB {
    int[] m = new int[12];

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
        System.out.println("numbers which > 7 in array: ");
        for (int i = 0; i < m.length; i++) {
            if (m[i] > 7)
                System.out.print(m[i]+ " ");
        }
        System.out.println();
    }

    public int method4() {
        int min = 0;
        int max = 0;
        int range;
        for (int i = 1; i < m.length; i++)
            if (m[i] < min)
                min = m[i];

        for (int i = 1; i < m.length; i++)
            if (m[i] > max)
                max = m[i];

        range = max - min;
        return range;
    }
}