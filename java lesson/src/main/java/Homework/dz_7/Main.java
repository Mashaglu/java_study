package Homework.dz_7;

import java.util.Scanner;


/*
1. Реализовать класс PhoneNumberValidator с методом boolean validate(String phone) русские операторы:
1. Если phone == null или пустая строка вернуть false;
2. Проверить
- что первый символ '+' или 8;
--- "+7 999 - 555_11 22" - true
--- "9 999 - 555_11 22" - false
- без учета +7 или 8 остальные цифры в количестве 10 шт;
--- "+7 999 - 555_11 2" - false
--- "+7 999 - 555_11 1122" - false
Дополнительные условия:
- Строка может содержать любые символы в ограниченном количестве до 20 шт. (a-z, 0 - 9, пробелы, -, _)

Д/З #2 Реализовать шифрование:
0. Класс StringCipher, метод  String decode(String str, int offset)
1. Вводную строку str разбить на символы .toCharArray();
2. char можно сравнить с int число в таблице ASCII;
3. Каждый символ массива char увеличить на число offset (chars[i] += offset);
4. Создать новую строку на основе измененного массива chars, = new String(chars);
5. Вернуть зашифрованную новую строку;
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите ваш номер телефона");
        final String phone = new Scanner(System.in).nextLine();
        System.out.println(PhoneNumberValidator.validatenumber(phone));

        System.out.println("\nВведите строку для шифрования");
        final String strforcode = new Scanner(System.in).nextLine();
        System.out.println("Введите число для шифрования");
        final int intforcode = new Scanner(System.in).nextInt();
        System.out.println(StringCipher.decode(strforcode, intforcode));

    }
}
