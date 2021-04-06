package homework6.task2;


public class Main {
    public static void main(String[] args) {
        Distance.Converter converter = new Distance.Converter();

        System.out.println(converter.fromKMtoMile(10));
        System.out.println(converter.fromMtoKM(300));
    }

    static class Distance {
        double distance;

        public void print() {

        }

        static class Converter {
            double fromMtoKM(double m) {
                return m / 1000;

            }

            double fromKMtoMile(double km) {
                return km / 8;
            }
        }

    }
}
