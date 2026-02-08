package Homework.dz_3;

/*
Реализовать интерфейс Car
Создать класс машин который имплементирует интерфейс Car
        Поля model,color,price
создать 3 разные машины

 */
public interface Car {
    default void run(){
        System.out.println("Машина едет");
    };
    default void stop(){
        System.out.println("Машина стоит");
    };
    String getModel();

    void setModel(String model);

    String getColor();

    void setColor(String color);

    double getPrice();

    void setPrice(double price);
}
