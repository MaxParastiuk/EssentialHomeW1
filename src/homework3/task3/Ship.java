package homework3.task3;

public class Ship extends Vehicle {
    public int numberPassengers;
    public String port;

    public Ship(int numberPassengers, String port, int price, int speed, int year) {
        super(price, speed, year);
        this.numberPassengers = numberPassengers;
        this.port = port;
    }

}
