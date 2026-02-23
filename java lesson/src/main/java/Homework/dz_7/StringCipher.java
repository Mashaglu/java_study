package Homework.dz_7;

public class StringCipher {

    public static String decode(String str, int offset) {
       final char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] += offset;
        }
        return String.valueOf(arr);
    }
}
