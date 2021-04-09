package homework7.task1;

public class Main {
    public static void main(String[] args) {
        final String RED = "\033[0;31m";
        ErrorPrinter print = new ErrorPrinter() {
            @Override
            public void printError(String error) {
                System.out.println(RED + error);
            }
        };
        print.printError("This text is red");
    }
}

interface ErrorPrinter {
    abstract void printError(String error);

}
