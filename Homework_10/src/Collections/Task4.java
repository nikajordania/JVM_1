package Collections;

import java.util.Arrays;
import java.util.Collections;

public class Task4 extends Task1 {
    public String SortRevers() {
        Collections.sort(list);
        Collections.reverse(list);
        return Arrays.toString(list.toArray());
    }
}