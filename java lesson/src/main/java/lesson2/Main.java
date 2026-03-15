package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // > < >= <= !=
        int num1 = 10;
        int num2 = 20;
        boolean res = num2 != num1;
        // System.out.println(res);
        // И || | +
        boolean b1 = true; // 1
        boolean b2 = false; // 0
        //      1    1  +  0 = 1
        boolean b3 = b1 || b2; // = true
        //           1  *  0 = 0
        boolean b4 = b1 && b2;
        boolean b5 = !b1;
        //           1    0 = 1
        boolean b6 = b1 ^ b2;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число");
//        String number = sc.nextLine();
//        Integer integer = Integer.valueOf(number);

//        System.out.println("Парное число = " + (integer % 2 == 0 ? "парное" : "непарное"));

        System.out.println("Max = " + (num1 > num2 ? num1 : num2));
        // ++ -- += -= *= /= %=
        // num2 = num2 % 2

        long number3 = 1233_1000_0_0000L;

        Integer number4 = null;
        Boolean bool1 = null;
        int number5;
        boolean b7;
        char cr;

        // д/з класс Car {String color, int fuel, String model, int doors}
    }
}
