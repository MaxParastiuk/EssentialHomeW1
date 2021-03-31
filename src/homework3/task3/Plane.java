package homework3.task3;

public class Plane extends Vehicle {
    public int height;
    int numberPassengers;

    public Plane(int height, int numberPassengers, int price, int speed, int year) {
        super(price, speed, year);
        this.height = height;
        this.numberPassengers = numberPassengers;
    }

}
