package Homework.dz_6.kitchen;

import java.util.Scanner;

/*
 2. Создать классы Повар, Курица, Индейка, Утка, Лосось, Карп, Осетр;
- в классе Повар static метод готовить принимает ингредиент (Курица, Осетр …) и выводит в консоль, что он готовит;
 */
public class CookRunner {
    public static void main(String[] args) {
        final Carp carp = new Carp();
        final Chicken chicken = new Chicken();
        final Duck duck = new Duck();
        final Salmon salmon = new Salmon();
        final Sturgeon sturgeon = new Sturgeon();
        final Turkey turkey = new Turkey();

        System.out.println("Выберите продукт для приготовления и введите цифру:\n 1 - Карп\n 2 - Курица\n 3 - Утка\n 4 - Лосось\n 5 - Осётр\n 6 - Индейка");

        final int product = new Scanner(System.in).nextInt();

        switch (product) {
            case 1 -> Chef.chefcook(carp);
            case 2 -> Chef.chefcook(chicken);
            case 3 -> Chef.chefcook(duck);
            case 4 -> Chef.chefcook(salmon);
            case 5 -> Chef.chefcook(sturgeon);
            case 6 -> Chef.chefcook(turkey);
        }


    }
}
