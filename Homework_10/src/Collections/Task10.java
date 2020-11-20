package Collections;

import java.util.Collections;
import java.util.Arrays;

public class Task10 extends Task1 {
    public String even() {

        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0)
                list.remove((list.get(i)));
        }

        return Arrays.toString(list.toArray());
    }
}