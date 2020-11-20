package Collections;

import java.util.Scanner;

public class Task15 {
    public void ConvertToDecimal() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Binary number:");
        String str = input.next();
        char[] chars = str.toCharArray();
        int result = 0;
        int mult = 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                result += mult;
            }
            mult *= 2;
        }
        System.out.println(result);

    }
}
