package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // > < >= <= !=
        int f=10;
        int b=20;
        boolean res = f>b;
       // System.out.println(res);
        // И ||- проверяет только 1 число при сложении |- проверяет оба числа при сложении
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        Integer  integer= Integer.valueOf(number);
        System.out.println("Парное число = " + (integer % 2 == 0 ? "парное" : "непарное"));

        boolean bo ;// по умолчанию false

    }
}
