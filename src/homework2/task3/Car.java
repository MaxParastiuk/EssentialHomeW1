package homework2.task3;

public class Car {
    private int age;
    private String color;
    private double speed;
    private int weight;

    public Car(int age) {
        this.age = age;
        this.color = "black";
        this.speed = 160;
        this.weight = 500;
    }

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
        this.speed = 155;
        this.weight = 580;
    }

    public Car(int age, String color, double speed) {
        this.age = age;
        this.color = color;
        this.speed = speed;
        this.weight = 680;
    }

    public Car(int age, String color, double speed, int weight) {
        this.age = age;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }
}
