package Homework.dz_1;

public class Part2 {
    public static void main(String[] args) {
        //2. Создайте переменную int age = [0, 100]:
        //2.1. Вывести в консоль (System.out.println(result))
        //2.1.1. Вывести взрослый или нет;
        int age = 52;
        if (age < 18) {
            System.out.println(age + " лет - Ребёнок");
        } else if (age >= 18 && age < 65) {
            System.out.println(age + " лет - Взрослый");
        } else if (age >= 65) {
            System.out.println(age + " лет - Пенсионер");
        }

//3.2. Реализуйте 3 объекта типа House;
        Home house1 = new Home();
        house1.width = 100;
        house1.height = 100;
        house1.address = "дом Колотушкина";
        house1.cost = 500.0;

        Home house2 = new Home("СПб", 150, 150, 50.0);

        Home house3 = new Home();

        System.out.println(" Адрес " + house3.address + "\n Цена " + house3.cost + "\n Ширина " + house3.width + "\n Длинна " + house3.height);
    }

}
