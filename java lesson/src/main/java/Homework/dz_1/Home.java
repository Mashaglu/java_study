package Homework.dz_1;

//3. Создайте класс Home {String address, int height, int width, double cost}
//3.1. Реализуйте все комбинации конструкторов;
public class Home {

    String address;
    int height;
    int width;
    double cost;

    public Home() {
    }

    public Home(String address, int height, int width, double cost) {
        this.address = address;
        this.height = height;
        this.width = width;
        this.cost = cost;
    }

}
