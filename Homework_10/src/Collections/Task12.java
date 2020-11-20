package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task12 implements Interfaces {
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    Random rand = new Random();

    @Override
    public void AddElements() {
        for (int i = 0; i < 20; i++) {
            list.add(rand.nextInt(100));
        }
        for (int i = 7; i < 15; i++)
            list2.add(list.get(i));

        System.out.println("Task12: " + Arrays.toString(list.toArray()));
    }

    @Override
    public String PrintItems() {
        return Arrays.toString(list2.toArray());

    }
}
