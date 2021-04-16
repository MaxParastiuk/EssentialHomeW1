package homework10.task2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Between {
    public static int[] between(int a, int b) {
        return IntStream.rangeClosed(a, b).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));
    }
}

