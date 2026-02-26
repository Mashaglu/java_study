package Homework.dz_8;

public class Transformation {

    public static void numbersum(String num) {
        int[] arr = new int[10];
        int sum = 0;
        final String nummod = num.replaceAll("[^\\p{Digit}]", "");
        for (char c : nummod.toCharArray()) {
            arr[c - '0']++;
            sum += c - '0';
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Количество цифр " + i + " в числе = " + arr[i]);
        }
        System.out.println("Общее количество цифр = " + nummod.length());
        System.out.println("Общая сумма цифр = " + sum);
    }

    public static void evennumber(int[] arr) {
        int sumeven = 0;
        int sumodd = 0;
        int even = 0;
        int odd = 0;
        for (int c : arr) {
            if (c % 2 == 0) {
                sumeven += c;
                even++;
            } else {
                sumodd += c;
                odd++;
            }
        }
        System.out.println("В массиве " + even + " четных чисел на сумму " + sumeven + " и " + odd + " нечетных чисел на сумму " + sumodd);
    }

    public static void letterdefinition(String text) {
        final char[] vowel = {'а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        var vowelstr = new StringBuilder();
        var consonantsstr = new StringBuilder();
        int vowelnum = 0;
        int consonantnum = 0;
        String textmod = text.toLowerCase().replaceAll("[^\\p{IsCyrillic}]", "");
        if (textmod.contains("ъ") || textmod.contains("ь")) {
            textmod = textmod.replaceAll("[ъь]", "");
            System.out.println("Исключены твердый и мягкий знак из текста");
        }
        for (char c : textmod.toCharArray()) {
            int i;
            for (i = 0; i < vowel.length; i++) {
                if (c == vowel[i]) {
                    vowelstr.append(c);
                    vowelnum++;
                    break;
                }
            }
            if (i == vowel.length) {    // дошли до конца массива — значит это согласная
                consonantsstr.append(c);
                consonantnum++;
            }
        }
        System.out.println("В данной строке " + vowelnum + " гласных: \"" + vowelstr + "\"");
        System.out.println("и " + consonantnum + " согласных: \"" + consonantsstr + "\"");
    }
    
    public static String reversetext(String text) {
        char[] textrev = text.toCharArray();
        for (int j = 0; j < textrev.length / 2; j++) {
            char beg = textrev[j];
            char end = textrev[textrev.length - j - 1];
            textrev[j] = end;
            textrev[textrev.length - j - 1] = beg;
        }
        return String.valueOf(textrev);
    }
}



