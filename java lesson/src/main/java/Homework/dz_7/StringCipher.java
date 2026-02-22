package Homework.dz_7;

public class StringCipher {

    public static void decode(String str, int offset) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] += offset);
        }
    }
}
