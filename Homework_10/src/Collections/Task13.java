package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task13 implements Interfaces {
    ArrayList<String> list = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    Random rand = new Random();

    @Override
    public void AddElements() {
        for (int i = 0; i < 20; i++) {
            String name = "";
            for (int j = 0; j < 10; j++) {
                int v = 1 + (int) (Math.random() * 26);
                char c = (char) (v + ('a') - 1);
                name += c;
            }
            list.add(name);
        }
    }
    public String x() {
        for (int i = 0; i < list.size(); i++) {
            String w = list.get(i);
            if (w.contains("x")) {
                list2.add(w);
            }
        }
        return Arrays.toString(list2.toArray());

    }

    @Override
    public String PrintItems() {
        return Arrays.toString(list.toArray());

    }
}
