import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Keke {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "sara", "jack");
        names = new ArrayList(names);
       Iterator<String> iterator = names.iterator();
        iterator.next();
        iterator.remove();

        System.out.println(iterator.next());



    }
}