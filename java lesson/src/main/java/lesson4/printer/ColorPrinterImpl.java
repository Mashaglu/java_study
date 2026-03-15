package lesson4.printer;

public class ColorPrinterImpl implements Printer {

    @Override
    public void print(String message) {
        System.out.println("Color Printer printing: " + message);
    }

    @Override
    public void clear() {
        System.out.println("Color Printer is clearing");
    }
}
