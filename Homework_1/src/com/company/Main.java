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
//        System.out.println(n1+n2+n3);
//        System.out.println(n1*n2*n3);

        //n5
        System.out.print("enter number: ");
        int dn4 = input.nextInt();
        String dns = String.valueOf(dn4);
        System.out.print("numbers symbols in number: "+ dns.length());
        int sum = 0;
        for (int i = 0; i < dns.length(); i++)
            System.out.println(dn4[i]);

    }
}
