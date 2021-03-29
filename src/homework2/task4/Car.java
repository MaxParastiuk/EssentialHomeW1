package homework2.task4;

public class Car {
    private int age;
    private String color;
    private double speed;
    private int weight;

    public Car(int age, String color, double speed, int weight) {
        this.age = age;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int age) {
        this(age, "blue", 120, 700);
    }

    public Car(int age, String color) {
        this(age, color, 250, 750);
    }

    public Car(int age, String color, double speed) {
        this(age, color, speed, 800);
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
