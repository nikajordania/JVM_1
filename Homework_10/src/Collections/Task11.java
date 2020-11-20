package Collections;

import java.util.Arrays;

public class Task11 extends Task1 {
    public String more30() {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 30)
                list.remove((list.get(i)));

        }

        return Arrays.toString(list.toArray());
    }

}
