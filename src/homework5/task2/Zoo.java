package homework5.task2;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add(0, "dog");
        list.add(1, "cat");
        list.add(2, "parrot");
        list.add(3, "hamster");
        list.add(4, "mouse");
        list.add(5, "cow");
        list.add(6, "bull");
        list.add(7, "pig");

        System.out.println(list);

        list.remove(7);
        list.remove(3);
        list.remove(5);

        System.out.println(list.size());
        System.out.println(list);
    }
}
