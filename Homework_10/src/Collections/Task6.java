package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Task6 extends Task1 {
    public String AddNextNumbs() {
        Random rand = new Random();
        ArrayList<Integer> NewList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
//            list.add(i, E rand.nextInt(10));
            NewList.add(list.get(i));
            NewList.add(rand.nextInt(10));
        }

        return Arrays.toString(NewList.toArray());
    }
}