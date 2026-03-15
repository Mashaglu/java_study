package lesson12.step2;

import java.util.*;

public class MapExecutor {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one"); // O(1)
        map.put(2, "two"); // O(1), O(logN)
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        Map<Test, Integer> testMap = new HashMap<>();
        testMap.put(new Test(100, "1"), 1);
        testMap.put(new Test(3, "1"), 2);

        System.out.println(testMap);

        Map<Test, Integer> treeMap = new TreeMap<>(Comparator.comparing(Test::getId).reversed());
        treeMap.putAll(testMap);

        System.out.println(treeMap);


    }
}
