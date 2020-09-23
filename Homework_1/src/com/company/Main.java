package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //n1
//        String[] lang = {"C++", "C#", "java", "pascal", "php", "JavaScript", "ActionScript"};
//        for (int i = 0; i < lang.length; i++) {
//            System.out.println(lang[i]);
//        }
//
//        //n2
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int a = input.nextInt();
//
//        System.out.print("Enter number 2: ");
//        int b = input.nextInt();
//
//        System.out.println(a / b);
//        System.out.println(b % a);
//
//        //n3
//        System.out.print("Enter number 1: ");
//        int n1 = input.nextInt();
//        System.out.print("Enter number 2: ");
//        int n2 = input.nextInt();
//        System.out.print("Enter number 3: ");
//        int n3 = input.nextInt();
//
//        System.out.println(n1*n2*n3);
//        System.out.println(n1+n2+n3);

        //n4
//        System.out.print("Enter number: ");
//        int num = input.nextInt();
//        char [] chars = String.valueOf(num).toCharArray();
//        for (char aChar : chars) {
//            System.out.println(aChar);
//        }


          //n5, n6
//        System.out.print("Enter number: ");
//        int num = input.nextInt();
//        int sum = 0;
//        while (num > 0) {
//            sum += num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);

//        n7
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();
        while (n2!=0){
            int usg = n1 % n2;
            n1 = n2;
            n2 = usg;
        }
        System.out.println(n1);

    }
}
