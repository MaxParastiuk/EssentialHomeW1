package Angle;

import java.util.Scanner;


public class Rectangle {
    public double side1;
    public double side2;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    double areaCalculator() {
        return side1 * side2;
    }

    double perimeterCalculator() {
        return (side1 + side2) * 2;
    }

    public static void main(String[] args) {
        System.out.println("Введите длину первой и второй стороны прямоугольника: ");
        Scanner in = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(in.nextDouble(), in.nextDouble());
        System.out.println("Площадь прямоугольника= " + rectangle.areaCalculator());
        System.out.println("Периметр прямоугольника= " + rectangle.perimeterCalculator());
    }
}

