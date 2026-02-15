package lesson5.step4;

public class Main {
    public static void main(String[] args) {
        // числа в диапазоне -128 до 127 в пуле целых чисел
        Integer number1 = 11;
        Integer number2 = 11;

        System.out.println("11 == 11 " + (number1 == number2));

        Integer number3 = 1111;
        Integer number4 = 1111;
        System.out.println("1111 == 1111 " + (number3 == number4));

        // Корректное сравнение
        System.out.println("1111 equals 1111 " + (number3.equals(number4)));

        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(str1 == str2);

        String str3 = new String("hello");
        System.out.println(str3 == str2);
        System.out.println(str3.equals(str2));
   }
}
