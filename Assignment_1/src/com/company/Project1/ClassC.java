package com.company.Project1;

import java.util.Scanner;

public class ClassC {
    int a, b, c;
    Scanner input = new Scanner(System.in);

    public void Method1() {
        System.out.print("Input integer a: ");
        a = input.nextInt();
        System.out.print("Input integer b: ");
        b = input.nextInt();
        System.out.print("Input integer c: ");
        c = input.nextInt();
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
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
        return (this.Method2() * this.Method3());
    }

    public int Method6() {
        return (this.Method3() + this.Method5());
    }
}
