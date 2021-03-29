package homework2.task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(2);
        Car car2 = new Car(3,"white");
        Car car3 = new Car(5,"black",120);
        Car car4 = new Car(4,"green", 134.5, 800);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

    }
}
