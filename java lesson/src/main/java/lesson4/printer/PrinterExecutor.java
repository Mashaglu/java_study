package lesson4.printer;

public class PrinterExecutor {
    public static void main(String[] args) {
        Printer colorPrinter = new ColorPrinterImpl();
        colorPrinter.print("Hello");
        colorPrinter.clear();

        Printer blackPrinter = new BlackPrinterImpl();
        blackPrinter.print("Hello");
        blackPrinter.clear();
    }
}
