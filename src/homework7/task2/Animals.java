package homework7.task2;

public enum Animals {
    CAT(10), DOG(5), PIG(3), WOLF(5), HAMSTER(1);
    private int year;

    Animals(int year) {
        this.year = year;
    }

    public String toString() {
        return this.name() + " year = " + year;
    }
}

class Main {
    public static void main(String[] args) {
        Animals animals = Animals.CAT;
        Animals animals1 = Animals.DOG;
        Animals animals2 = Animals.PIG;
        Animals animals3 = Animals.WOLF;
        Animals animals4 = Animals.HAMSTER;

        System.out.println(animals.toString());
        System.out.println(animals1.toString());
        System.out.println(animals2.toString());
        System.out.println(animals3.toString());
        System.out.println(animals4.toString());
    }
}
