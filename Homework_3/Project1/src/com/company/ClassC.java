package com.company;

import java.util.Scanner;

public class ClassC {
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

    public int Method2() {
        return a % 10; // return last digit of number
    }

    public int Method3() {
        while (b > 9) {
            b = b / 10; //return first digit of number
        }
        return b;
    }

    public int Method4() {
        int sum = 0;
        while (c != 0) {
            sum += (c % 10); //add last digit of number
            c /= 10; //divides number return number digit last -1
        }
        return sum;
    }

    public int Method5() {
        return a + b + c + this.Method2();
    }

    public int Method6() {
        return (this.Method4() + this.Method5());
    }
}
