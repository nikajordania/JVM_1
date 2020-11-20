package Collections;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task9 extends Task1 {
    public String RemoveIndexNumbs() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number for remove: ");
        int n = input.nextInt();
        if (n < 0 || n > list.size()) {
            System.out.println("The number does not match the number of elements");
            System.out.println("Number will be remove from end of list");
            n = list.size();
            list.remove(n);
        }
        else
            list.remove(n-1);


        return Arrays.toString(list.toArray());
    }
}