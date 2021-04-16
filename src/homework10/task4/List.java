package homework10.task4;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        list.add("Pig");
        list.add("Hamster");
        list.add("Wolf");

        System.out.println(list);

        list.set(1, "Dog");
        System.out.println(list);

        System.out.println(list.get(1));

        list.remove(1);
        System.out.println(list);

        System.out.println(list.indexOf("Wolf"));

        System.out.println(list.size());

        System.out.println(list.toString());

        list.clear();
        System.out.println(list.size());

        System.out.println(list.isEmpty());
    }
}
