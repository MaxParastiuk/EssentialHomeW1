package homework3;

import homework3.add_task.Printer;
import homework3.task2.ClassRoom;
import homework3.task3.Car;
import homework3.task3.Plane;
import homework3.task3.Ship;
import homework3.task4.DocumentWorker;
import homework3.task4.ExpertDocumentWorker;
import homework3.task4.ProDocumentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        main.startTask2();
        main.startTask3();
        main.startTask4();
        main.startAddTask();
    }

    void startTask2() {
        ClassRoom room = new ClassRoom();
    }

    void startTask3() {
        Ship ship = new Ship(120, "Роттердам", 1000, 250, 2000);
        Plane plane = new Plane(10, 300, 600, 700, 2008);
        Car car = new Car(50, 120, 2003);

        System.out.println("Корабль. Количество пассажиров: " + ship.numberPassengers + " Порт: " + ship.port + " Цена: " +
                ship.getPrice() + " Cкорость: " + ship.getSpeed() +
                " Год выпуска: " + ship.getYear());

        System.out.println("Самолет. Высота: " + plane.height + " Количество пассажирова: " + ship.numberPassengers +
                " Цена: " + plane.getPrice() + " Скорость: "
                + plane.getSpeed() + " Год выпуска: " + plane.getYear());

        System.out.println("Машина. Цена: " + car.getPrice() + " Скорость: "
                + car.getSpeed() + " Год выпуска: " + car.getYear());
    }

    void startTask4() {
        final int ProLicense = 1;
        final int ExpLicense = 2;


        System.out.println("Введите ключ активации: ");
        Scanner scanner = new Scanner(System.in);
        int license = scanner.nextInt();

        switch (license) {
            case ProLicense:
                ProDocumentWorker worker = new ProDocumentWorker();
                worker.EditDocument();
                worker.saveDocument();
                break;

            case ExpLicense:
                ExpertDocumentWorker worker1 = new ExpertDocumentWorker();
                worker1.SaveDocument();
                break;

            default:
                DocumentWorker worker2 = new DocumentWorker();
                worker2.openDocument();
                worker2.editDocument();
                worker2.saveDocument();
                break;
        }
    }


    void startAddTask() {
    }
}
