package Homework.dz_3;

public class CarImpl implements Car {
    private String model;
    private String color;
    private double price;


    public CarImpl(){};
public CarImpl(String model, String color, double price) {
    this.model = model;
    this.color = color;
    this.price = price;
}

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }
}
