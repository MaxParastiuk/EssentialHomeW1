package homework4.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileFormat;
        System.out.println("Enter the file format");
        Scanner in = new Scanner(System.in);
        fileFormat = in.next();

        if (fileFormat.equalsIgnoreCase("DOC")) {
            AbstractHandler doc = new DOCHandler();
            doc.open();
            doc.create();
            doc.change();
            doc.save();
        } else if (fileFormat.equalsIgnoreCase("TXT")) {
            AbstractHandler txt = new TXTHandler();
            txt.open();
            txt.create();
            txt.change();
            txt.save();
        } else if (fileFormat.equalsIgnoreCase("XML")) {
            AbstractHandler xml = new XMLHandler();
            xml.open();
            xml.create();
            xml.change();
            xml.save();
        } else
            System.out.println("Failed format! Enter again!");
    }
}
