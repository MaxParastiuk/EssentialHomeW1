package homework7.task3_add;

public enum Vehicles {
    BMW(1000, "black"), AUDI(900, "red"), BENTLEY(2000, "white");
    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return this.name() + " pirce: " + price + " color: " + getColor();
    }
}
class Main {
    public static void main(String[] args) {
        Vehicles car = Vehicles.BMW;
        Vehicles car2 = Vehicles.AUDI;
        Vehicles car3 = Vehicles.BENTLEY;

        System.out.println(car.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
    }
}