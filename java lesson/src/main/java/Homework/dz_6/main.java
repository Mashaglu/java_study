package Homework.dz_6;

/*
1. Создать объект date = LocalDate.now(), проверить пору года (весна, лето, зима, осень);
3. реализовать enum курсы валют с полями наименование на русском, код валюты, коэффициент относительно доллара
 */

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

import static Homework.dz_6.CurrencyRate.*;
import static Homework.dz_6.Season.*;

public class main {
    public static void main(String[] args) {

        final LocalDate date = LocalDate.now();
        final int month = date.getMonthValue();
        final String name = date.getMonth().getDisplayName(TextStyle.FULL_STANDALONE, new Locale("ru"));
        switch (month) {
            case 12, 1, 2 -> print(month, name, WINTER.getRusName());
            case 3, 4, 5 -> print(month, name, SPRING.getRusName());
            case 6, 7, 8 -> print(month, name, SUMMER.getRusName());
            case 9, 10, 11 -> print(month, name, AUTUMN.getRusName());
        }

        System.out.println("\nВведите код валюты");
         final int choice = new Scanner(System.in).nextInt();

        switch (choice) {
            case 1 -> System.out.println(USD.toString());
            case 2 -> System.out.println(EUR.toString());
            case 3 -> System.out.println(CNY.toString());
            case 4 -> System.out.println(AED.toString());

            default -> System.out.println("Ошибка: неизвестный код валюты");

        }
    }

    private static void print(int month, String name, String rusName) {
        System.out.printf("Сейчас %d месяц - %s. Является один из месяцев времени года: %s", month, name, rusName);
    }

}
