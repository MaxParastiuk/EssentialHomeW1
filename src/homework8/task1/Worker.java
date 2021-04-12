package homework8.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Worker {
    private String fio;
    private String position;
    String yearJoing;

    @Override
    public String toString() {
        return "Worker{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", yearJoing='" + yearJoing + '\'' +
                '}';
    }

    public Worker(String fio, String position, String yearJoing) {
        this.fio = fio;
        this.position = position;
        this.yearJoing = yearJoing;

    }
}

class Main {
    public static boolean isThisDateValid(String dateToValidate, String dateFormat) {
        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(System.in);
        Worker[] worker = new Worker[4];
        for (int i = 0; i < worker.length; i++) {
            String fio = "";
            String post = "";
            String year = "";
            System.out.println("ФИО = ");
            fio = in.next();
            System.out.println("Должность = ");
            post = in.next();
            System.out.println("Год = ");
            year = in.next();

            isThisDateValid(year, "yyyy");

            worker[i] = new Worker(fio, post, year);
        }
        for (int i = 0; i < worker.length; i++) {
            System.out.println(worker[i].toString());
        }
        System.out.println("Input value:");
        int value = Integer.parseInt(in.next());
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = 0; i < worker.length; i++) {
            String year = worker[i].yearJoing;
            int experience = yearNow - Integer.parseInt(year);
            if (experience > value) {
                System.out.println(worker[i].toString());
            }
        }
    }
}
