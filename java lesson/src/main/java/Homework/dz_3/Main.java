package Homework.dz_3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new CarImpl();
        car1.setColor("Голубой");
        System.out.println(car1.getColor());

        Car car2 = new CarImpl();
        car2.setModel("Niva");
        System.out.println(car2.getModel());

        Car car3 = new CarImpl();
        car3.setPrice(600_000.90);
        System.out.println(car3.getPrice());

        Car car4 = new CarImpl("Ауди","Синий",900_000.90 );
        System.out.println(car4.getColor() + " " +  car4.getModel()+ " " +  car4.getPrice());
    }
}
