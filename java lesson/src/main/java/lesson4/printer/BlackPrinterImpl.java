package lesson4.printer;

public class BlackPrinterImpl implements Printer {

    @Override
    public void print(String message) {
        System.out.println("Black Printer printing: " + message);
    }

    @Override
    public void clear() {
        System.out.println("Black Printer is clearing");;
    }
}
