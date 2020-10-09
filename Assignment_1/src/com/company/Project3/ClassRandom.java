package com.company.Project3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassRandom {
    int a, b;
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void Input() {
        System.out.print("Input integer a: ");
        a = input.nextInt();
        System.out.print("Input integer b: ");
        b = input.nextInt();
        System.out.printf("a = %d, b = %d\n", a, b);
        if (a > b)
            this.swap();
        this.GenArray();
        this.SumOfArrays();
    }

    public void swap() {
        System.out.println("a > b swapping!");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("a = %d, b = %d\n", a, b);
    }

    public void GenArray() {
        int e = 0, o = 0;
        int[] m = new int[40];
        for (int i = 0; i < m.length; i++) {
            m[i] = new Random().nextInt(b - a) + a;
        }
        System.out.println(Arrays.toString(m));

        for (int j : m) {
            if (j % 2 == 0) {
                e += 1;
                even.add(j);
            } else {
                o += 1;
                odd.add(j);
            }
        }
        System.out.printf("Even = %d, Odd = %d\n", e, o);
        System.out.println("Even: " + Arrays.toString(even.toArray()));
        System.out.println("Odd: " + Arrays.toString(odd.toArray()));

    }

    public void SumOfArrays() {
        int SumEven = 0, SumOdd = 0;
        for (int i = 0; i < even.size(); i++)
            SumEven += even.get(i);
        for (int i = 0; i < odd.size(); i++)
            SumOdd += odd.get(i);

        System.out.printf("Sum of Evens = %d\nSum of Odds = %d\n", SumEven, SumOdd);
        a = SumEven;
        b = SumOdd;
        this.swap();
        int[] m5 = new int[5];
        for (int i = 0; i < m5.length; i++) {
            m5[i] = new Random().nextInt(b - a) + a;
        }
        System.out.println(Arrays.toString(m5));

    }
}