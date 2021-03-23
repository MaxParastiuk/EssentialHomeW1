package Computer;

public class Computer {
    String comp;

    public static void main(String[] args) {
        Computer[] computer = new Computer[5];

        computer[0] = new Computer();
        computer[1] = new Computer();
        computer[2] = new Computer();
        computer[3] = new Computer();
        computer[4] = new Computer();

        for (int i = 0; i < 5; i++) {
            computer[i].comp = "comp " + i;
            System.out.println(computer[i].comp);
        }
    }
}
