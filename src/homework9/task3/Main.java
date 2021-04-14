package homework9.task3;


public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung", 120, "AB1234567CD");
        Monitor monitor = new Monitor("Samsung", 120, "AB1234567CD",
                1280, 1024);

        Monitor monitor2 = new Monitor("Samsung", 120, "AB1234567CD",
                1280, 1024);

        Monitor monitor3 = new Monitor("Samsung", 120, "AB1234567CD",
                1280, 1024);

        Monitor monitor4 = new Monitor("Asus", 130,
                "CD1231231", 1680, 1024);

        Monitor monitor5 = new Monitor("Acer", 150,
                "DD1313123", 1820, 720);

        System.out.println(device);
        System.out.println(monitor);

        System.out.println(device.equals(monitor));
        System.out.println(monitor.hashCode());
        System.out.println(monitor2.hashCode());
        System.out.println(monitor3.hashCode());
        System.out.println(monitor4.hashCode());
        System.out.println(monitor5.hashCode());

    }
}
