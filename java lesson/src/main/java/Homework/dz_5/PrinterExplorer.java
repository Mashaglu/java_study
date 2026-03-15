package Homework.dz_5;

/*3. Создать 3 класса наследующие AbstractPrinter, например HPColorPrinter, CanonBlackPrinter;
4. Создать класс PrinterExplorer и реализовать все 3 принтера и вызвать методы;
*/

import Homework.dz_5.impl.CanonColorPrinter;
import Homework.dz_5.impl.EpsonBlackPrinter;
import Homework.dz_5.impl.HPColorPrinter;

public class PrinterExplorer {
    public static void main(String[] args) {

        final Printer printer1 = new HPColorPrinter("HP123", "цветной");
        printer1.getPrinterModel();
        printer1.getPrinterType();
        printer1.print();
        printer1.clear();

        final Printer printer2 = new EpsonBlackPrinter("Epson321", "черно - белый");
        printer2.getPrinterModel();
        printer2.getPrinterType();
        printer2.print();
        printer2.clear();

        final Printer printer3 = new CanonColorPrinter("Canon567", "цветной");
        printer3.getPrinterModel();
        printer3.getPrinterType();
        printer3.print();
        printer3.clear();


    }
}
