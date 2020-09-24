package com.company;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;


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
//        System.out.print("Enter first number: ");
//        int n1 = input.nextInt();
//        System.out.print("Enter second number: ");
//        int n2 = input.nextInt();
//        while (n2!=0){
//            int usg = n1 % n2;
//            n1 = n2;
//            n2 = usg;
//        }
//        System.out.println(n1);

        //n8
//        System.out.print("Enter from number: ");
//        int n1 = input.nextInt();
//        System.out.print("Enter to number: ");
//        int n2 = input.nextInt();
//        while (n1 <= n2){
//            System.out.println(n1);
//            n1++;
//        }

//        n9
//        int[] array = {917, 884, -62, 230, 162, 244, -345, 516};
//        int min = array[0];
//        int max = array[0];
//        for(int i = 0; i <= array.length-1; i++) {
//            System.out.print(array[i]);
//            if (array[i] < min)
//                min = array[i];
//            if (array[i] > max)
//                max = array[i];
//        }
//        System.out.println("Min number in array is: " + min );
//        System.out.println("Max number in array is: " + max );
//        n10
//        int[] array = {917, 884, -62, 230, 162, 244, -345, 516};
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));

//        n11
//        int[] array = new int[8];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * (1000 - (-1000)) ) + (-1000);
//
//        }
//        System.out.println(Arrays.toString(array));

//        n12
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * (1000 - (-1000)) ) + (-1000);
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + " ");
        }

    }
}
