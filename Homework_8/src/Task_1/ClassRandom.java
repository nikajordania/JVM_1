package Task_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassRandom implements Interfaces {
    int[] m = new int[15];

    @Override
    public void method_1() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("Input number a: ");
        a = input.nextInt();
        System.out.print("Input number b: ");
        b = input.nextInt();

        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(b - a) + a;
        }
        System.out.println(Arrays.toString(m));
    }

    @Override
    public int method_2() {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < i) {
                sum += m[i];
            }
        }
        return sum;
    }
    @Override
    public int method_3() {
        int mult = 1;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > i) {
                mult *= i+1;
            }
        }
        return mult;
    }

    @Override
    public void method_4() {
        for (int j : m) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}
