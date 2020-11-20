package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task1 implements Interfaces {
    ArrayList<Integer> list = new ArrayList<>();
    Random rand = new Random();
    @Override
    public void AddElements() {
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(100));
        }
    }

    @Override
    public String PrintItems() {
        return Arrays.toString(list.toArray());

    }
}
