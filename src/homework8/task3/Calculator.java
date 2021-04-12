package homework8.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    double add(double a, double b) {
        return a + b;
    }

    double div(double a, double b) {
        double c = 0;

        if (b != 0) {
            c = a / b;
        } else {
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        return c;
    }

    double mul(double a, double b) {
        return a * b;
    }

    double sub(double a, double b) {
        return a - b;
    }

}
class Main {
    public static void main(String[] args) throws IOException {
        String operation;

        Calculator calc = new Calculator();

        Scanner in = new Scanner(System.in);

        System.out.print("Input a: ");
        double a = Double.parseDouble(in.next());

        System.out.print("Input b: ");
        double b = Double.parseDouble(in.next());

        System.out.print("Input operation(+, -, *, /):");
        operation = in.next();
        
        switch (operation) {
            case "+":
                System.out.println("Answer is: " + calc.add(a, b));
                break;
            case "-":
                System.out.println("Answer is: " + calc.sub(a, b));
                break;
            case "/":
                try {
                    System.out.println("Answer is: " + calc.div(a, b));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "*":
                System.out.println("Answer is: " + calc.mul(a, b));
                break;
            default:
                System.out.println("Wrong operation!");
        }
    }
}
