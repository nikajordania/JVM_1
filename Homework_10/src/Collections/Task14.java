package Collections;

import java.util.Scanner;

public class Task14 {
    public void ConvertToBinary() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Decimal number:");
        int num = input.nextInt();
        String last = "";
        while (num > 0) {
            int mod = num % 2;
            num = num / 2;
            String binary = Integer.toString(mod);
            last = mod + last;
        }
        System.out.println("Converted to Binary: " + last);
    }
}