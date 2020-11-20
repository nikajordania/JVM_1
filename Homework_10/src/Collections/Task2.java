package Collections;

import java.util.Collections;
import java.util.Arrays;

public class Task2 extends Task1 {
    public String ret(){
        Collections.reverse(list);
        return Arrays.toString(list.toArray());
    }

}
