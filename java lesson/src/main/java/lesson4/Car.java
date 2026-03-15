package lesson4;

public interface Car {
    void run();
    void stop();

    String getModel();
    String getColor();
    double getPrice();

    void setModel(String model);
    void setColor(String color);
    void setPrice(double price);
}
