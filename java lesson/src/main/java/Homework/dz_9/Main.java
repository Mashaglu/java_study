package Homework.dz_9;
/*
д/з 1. Введено два слова проверить являются они анаграммами (проверите на пустоту строк, на длину строк, проверки на одинаковость отсортированных списков букв): например  Аня – Яна;
2. Развернуть `List<Integer>` “на месте” без создания второго списка, используйте доп. метод
void swap(Integer a, Integer b) {
    Integer temp = a;
    a = b;
    b = temp;
}
3. Удалить из `List<Integer>` все чётные числа (важно сделать корректно, без пропуска элементов).
        4. Дан `List<Integer>`. Найти сумму, среднее, максимум, минимум;
5. Дан `List<Integer>`. Заменить все отрицательные элементы на `0`;
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите два слова через пробел");
        final Scanner sc = new Scanner(System.in);
        final String firstwords = sc.next();
        final String secondwords = sc.next();
        ArrTransform.isAnagram(firstwords, secondwords);

        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            var a = new Random().nextInt(20) - 10;
            list.add(a);
        }

        System.out.println("\nИзначальный список : " + list);
        System.out.print("Развёрнутый список : ");
        ArrTransform.reverse(list);
        System.out.print("Список нечётных чисел : ");
        ArrTransform.evennumber(list);
        ArrTransform.operation(list);
        System.out.print("Список без отрицательных значений : ");
        ArrTransform.excludenegative(list);
    }
}
