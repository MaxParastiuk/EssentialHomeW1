package homework5.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 10; i <= 20; i++) {
            list.add(i);
        }
        for (Integer temp : list) {
            System.out.println(temp);
        }
        System.out.println("-----------");
        System.out.println("Минимальное число: " + Collections.min(list));
        System.out.println("Максимальное число: " + Collections.max(list));
        System.out.println("-----------");

        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer integer = listIterator.next() + 1;
            System.out.println(integer);
        }
    }
}
