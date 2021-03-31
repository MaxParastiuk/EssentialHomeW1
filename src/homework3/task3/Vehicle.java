package homework3.task3;


public class Vehicle {
    private int price;
    private int speed;
    private int year;

    Vehicle(int price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    Vehicle() {

    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }


}
