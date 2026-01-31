package Homework.dz_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// 1. Создайте переменную int number = любое число:
//            1.1. Вывести в консоль (System.out.println(result))
//           1.1.1. number в диапазоне [100, 1000];
        System.out.println("Введите номер проверки \r\n 1 - Проверка на вхождение в диапазон [100, 1000] \r\n 2 - Проверка на невхождение в диапазон [1, 1000] \r\n 3 - Проверка на вхождение в диапазоны  [1, 10] или [100, 300] \r\n 4 - Проверка на чётность \r\n 5 - Проверка на кратность 5 и 7 \r\n 6 - Проверка на кратное 3 но не кратное 9");
        Scanner sc = new Scanner(System.in);
        int vari = sc.nextInt();
        System.out.println("Введите ваше число");
        Scanner sc2 = new Scanner(System.in);
        int number = sc2.nextInt();

        if (vari == 1) {
            System.out.println(100 <= number && number <= 1000 ? "Ваше число " + number + " в диапазоне [100, 1000]" : "Ваше число " + number + " не в диапазоне [100, 1000]");
        }
        //1.1.2. number за пределами диапазона [1, 1000];
        else if (vari == 2) {
            System.out.println(1 <= number && number <= 1000 ? "Ваше число " + number + " в диапазоне [1, 1000]" : "Ваше число " + number + " за пределами диапазона [1, 1000]");

        }
        //1.1.3. number только в диапазонах [1, 10] или [100, 300];
        else if (vari == 3) {
            System.out.println(1 <= number && number <= 10 ? "Ваше число " + number + " в диапазоне [1, 10]" : 100 <= number && number <= 300 ? "Ваше число " + number + " в диапазоне [100, 300]" : "Ваше число " + number + " за пределами этих диапазонов");
        }
        //1.1.4. number четное;
        else if (vari == 4) {
            System.out.println(number % 2 == 0 ? "Ваше число " + number + " чётное" : "Ваше число " + number + " нечётное");
        }
        //1.1.5. number кратное 5 и 7;
        else if (vari == 5) {
            System.out.println(number % 5 == 0 && number % 7 == 0 ? "Ваше число " + number + " кратное 5 и 7" : "Ваше число " + number + " не кратное 5 и 7");
        }
        //1.1.6. number кратное 3 но не кратное 9;
        else if (vari == 6) {
            System.out.println(number % 3 == 0 ? number % 9 != 0 ? "Ваше число " + number + " кратное 3, но не кратное 9" : "Ваше число " + number + " кратное 3 и кратное 9" : "Ваше число " + number + " не кратное ни 3, ни 9");
        }

    }
}
