package homework2.task2;

public class Car {
    private int age;
    private String color;

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Car(int age) {
        this.age = age;
        this.color = "black";
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
