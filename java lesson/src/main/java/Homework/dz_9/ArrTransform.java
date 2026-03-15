package Homework.dz_9;

import java.awt.*;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class ArrTransform {

    public static void isAnagram(String one, String two) {
        if (one.length() == two.length() && (one != null && !one.isEmpty()) && (two != null && !two.isEmpty())) {
            final List<Character> lone = new ArrayList<>();
            final List<Character> ltwo = new ArrayList<>();
            for (char c : one.toLowerCase().toCharArray()) {
                lone.add(c);
            }
            for (char c : two.toLowerCase().toCharArray()) {
                ltwo.add(c);
            }
            Collections.sort(lone);
            Collections.sort(ltwo);
            if (lone.equals(ltwo)) {
                System.out.println("Слова являются анаграммами");
            } else {
                System.out.println("Слова не являются анаграммами");
            }
        } else {
            System.out.println("Слова не являются анаграммами");
        }
    }

    public static void reverse(List<Integer> origlist) {
        List<Integer> list = new ArrayList<>(origlist);
        for (int i = 0; i < list.size() / 2; i++) {
            swap(list, i, list.size() - i - 1);
        }
        System.out.println(list);
    }

    private static void swap(List<Integer> list, Integer a, Integer b) {
        Integer temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static void evennumber(List<Integer> origlist) {
        List<Integer> list = new ArrayList<>(origlist);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        reverse(list);
    }

    public static void operation(List<Integer> list) { //сумму, среднее, максимум, минимум
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : list) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        double avg = sum * 1.0 / list.size();
        System.out.println("Сумма = " + sum);
        System.out.println("Среднее = " + avg);
        System.out.println("Максимум = " + max);
        System.out.println("Минимум = " + min);
    }

    public static void excludenegative(List<Integer> origlist) {
        List<Integer> list = new ArrayList<>(origlist);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                list.set(i, 0);
            }
        }
        System.out.println(list);
    }
}