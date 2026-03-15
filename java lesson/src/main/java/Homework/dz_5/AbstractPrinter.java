package Homework.dz_5;

/*2. Создать абстрактный класс AbstractPrinter имплементировать методы Printer и добавить поля:
- printerModel;
- printerType (цветной или чб);
 */

public abstract class AbstractPrinter implements Printer {
    private String printerModel;
    private String printerType;

    public AbstractPrinter(String printerModel, String printerType) {
        this.printerModel = printerModel;
        this.printerType = printerType;
    }

    protected AbstractPrinter() {
    }

    @Override
    public void print() {
        System.out.println("Начало печати в принтере " + this.printerModel);
    }

    @Override
    public void clear() {
        System.out.println("Очистка очереди на печать у принтера " + this.printerModel);
    }

    @Override
    public void getPrinterModel() {
        System.out.println("Printer Model: " + this.printerModel);
    }

    @Override
    public void getPrinterType() {
        System.out.println("Printer Type: " + printerType);
    }
}
