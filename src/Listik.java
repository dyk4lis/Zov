
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

import java.util.ArrayList;

public class Listik {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).equalsIgnoreCase("bug")) {
                list.remove(i);
                if(i>0) {
                    i--;
                }
            }

        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().equalsIgnoreCase("bug")){
                iterator.remove();

            }
        }



    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list); // Создаем копию списка
        for (String str : listCopy) {
            if (str.equalsIgnoreCase("bug")) {
                list.remove(str);

            }
        }
        list = listCopy;
    }

}
