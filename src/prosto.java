import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class prosto {
    public static void main(String[] args) {
        HashMap<Integer, String> list = new HashMap<>();
        list.put(7, "пупакабра");
        list.put(23, "dinozavr");

        ArrayList<Integer> keys = new ArrayList<>(list.keySet());
        ArrayList<String> values = new ArrayList<>(list.values());
        System.out.println(values);
        System.out.println(keys + "|");


        System.out.println(list.containsKey(7));
        System.out.println(list.containsValue("dinozavr"));
        System.out.println(list.size());


        for (Map.Entry entry : list.entrySet()) {

            System.out.println(entry);


            if (!list.isEmpty()) {
                System.out.println(list.size());

            }


//        int count = 2;
//        int value = switch (count){
//            case 1,3,5->12;
//            case 2,4,6->13;
//            case 7,8,9->14;
//            default -> 228;
//        };
//        System.out.println(value);

        }
    }
}

