package ignore_tutorials;

public class GenericExample {

    public static void main(String[] args) {

        Printer<Integer> printer = new Printer<>(99);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(77.99);
        doublePrinter.print();

    }


}
