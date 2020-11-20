package Collections;

import java.util.Arrays;
import java.util.Random;


public class Task5 extends Task1 {
    public String AddNumbs() {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            list.add(rand.nextInt(10));
        }
        return Arrays.toString(list.toArray());
    }
}