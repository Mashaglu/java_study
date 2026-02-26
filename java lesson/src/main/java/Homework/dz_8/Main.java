package Homework.dz_8;

import java.util.Scanner;

/*
1. Дано число 1234456771. Найти количество цифр и сумму цифр.
2. Дан массив чисел [1, 5, 8, 11, 0, -5, 13, 81, 100] посчитать количество и сумму парных и не парных чисел;
3. Дана любая строка, посчитать количество гласных и согласных букв;
4. Разворот введенной строки, без использования StringBuilder-а (преобразовать в массив символов потом перезаписать 0 и последний и так по порядку, и вернуть new String(массив символов));

 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите ваше число");
        final String number = new Scanner(System.in).nextLine();
        Transformation.numbersum(number);

        final int[] arr = {1, 5, 8, 11, 0, -5, 13, 81, 100};
        Transformation.evennumber(arr);

        System.out.println("Введите вашу строку");
        final String text = new Scanner(System.in).nextLine();
        Transformation.letterdefinition(text);
        System.out.println(Transformation.reversetext(text));
    }
}
