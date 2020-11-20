package Collections;

import java.util.Arrays;
import java.util.Collections;

public class Task3 extends Task1 {
    public String sort() {
        Collections.sort(list);
        return Arrays.toString(list.toArray());
    }
}