package homework6.task3;

public class Сalculator {
    public static void main(String[] args) {
     Calc calculate = new Calc();

        System.out.println(calculate.sum(10,5));
        System.out.println(calculate.subtraction(10,5));
        System.out.println(calculate.division(10,5));
        System.out.println(calculate.multiplication(10,5));
    }

    static class Calc {
        double sum(double num1, double num2) {
            return num1 + num2;
        }

        double subtraction(double num1, double num2) {
            return num1 - num2;
        }

        double division(double num1, double num2) {
            return num1 / num2;
        }

        double multiplication(double num1, double num2) {
            return num1 * num2;
        }
    }
}

