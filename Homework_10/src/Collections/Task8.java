package Collections;

import java.util.Arrays;


public class Task8 extends Task1 {
    public String RemoveFirst3Numbs() {

        for (int i = 0; i <= 2; i++) {
            list.remove(0);
        }


        return Arrays.toString(list.toArray());
    }
}