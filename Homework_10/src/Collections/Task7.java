package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task7 extends Task1 {
    public String AddNextInput() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = input.nextInt();
        if (n < 0 || n > list.size()) {
            System.out.println("The number does not match the number of elements");
            System.out.println("and list will be selected the end of list");
            list.add(rand.nextInt(10));
        }
        else
            list.add(n, rand.nextInt(10));


        return Arrays.toString(list.toArray());
    }
}