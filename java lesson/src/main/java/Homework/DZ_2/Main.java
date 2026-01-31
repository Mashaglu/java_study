package Homework.DZ_2;

public class Main {
    public static void main(String[] args) {
         Car c1=new Car();
                 c1.color="blue";
                 c1.fuel= 1;
                 c1.engine = 2;
                 c1.doors= 2;
                 c1.model= "BMW";


        Car c2=new Car("Синий",12,12,"Красивая",5);

        Car c3=new Car();

        System.out.println(c1.color + " " + c1.fuel + " " + c1.engine + " " + c1.model + " " + c1.doors);


    }
}
