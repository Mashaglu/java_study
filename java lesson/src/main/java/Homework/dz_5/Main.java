package Homework.dz_5;

/* д/з 1. Создать класс Computer (int id, String cpu, int ram, String videoCard, int power), переопределить методы equlals(), toString(), hashCode(), реализуйте 3 версии класса (x,y,z);
2. Проверить правильность переопределения метода equlals():
a) Рефлексивность: x.equals(x) должен возвращать true;
b) Симметричность: если x.equals(y) возвращает true, то y.equals(x) тоже должен возвращать true;
c) Консистентность: повторные вызовы x.equals(y) должны возвращать одинаковый результат, если объекты не изменились;

2. Реализовать класс коннектор к БД CassandraDBConnector implements DBConnector;

Задание со звездочкой:
1. Создать интерфейс Printer c абстрактными методами
 - void print();
- void clear();
- void getPrinterModel();
2. Создать абстрактный класс AbstractPrinter имплементировать методы Printer и добавить поля:
- printerModel;
- printerType (цветной или чб);
3. Создать 3 класса наследующие AbstractPrinter, например HPColorPrinter, CanonBlackPrinter;
4. Создать класс PrinterExplorer и реализовать все 3 принтера и вызвать методы;
 */


import lesson5.step1.DBConnector;

public class Main {
    public static void main(String[] args) {
        final Computer computer1 = new Computer("16", 64, "GeForce", 500);
        System.out.println("computer1 =" + computer1);
        System.out.println("hashCode computer1 =" + computer1.hashCode());

        final Computer computer2 = new Computer("16", 64, "GeForce", 500);
        System.out.println("computer2 =" + computer2);
        System.out.println("hashCode computer2 =" + computer2.hashCode());

        final Computer computer3 = new Computer("32", 64, "GeForce", 500);
        System.out.println("computer3 =" + computer3);
        System.out.println("hashCode computer3 =" + computer3.hashCode());

        System.out.println("x.equals(x) = " + computer1.equals(computer1));
        System.out.println("x.equals(y) = " + computer1.equals(computer2));
        System.out.println("y.equals(x) = " + computer2.equals(computer1));
        System.out.println("x.equals(z) = " + computer1.equals(computer3));

        //* 2. Реализовать класс коннектор к БД CassandraDBConnector implements DBConnector;

        final DBConnector cassandraDB = new CassandraDBConnector(
                "user",
                "123",
                "localhost",
                5432,
                "db1");

        System.out.println("Connecting to database Cassandra");
        cassandraDB.connect();
        cassandraDB.disconnect();


    }
}
