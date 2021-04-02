package homework4.task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String play = "play";
        final String record = "record";

        System.out.println("Play or record?");
        Scanner in = new Scanner(System.in);
        String function = in.next();

        switch (function) {

            case play:
                Player playing = new Player();
                playing.play();
                playing.pause();
                playing.stop();
                break;
            case record:
                Player recording = new Player();
                recording.play();
                recording.record();
                recording.stop();
                break;
            default:
                System.out.println("There is no such function!");
        }
    }
}
