package Homework.dz_7;


public class PhoneNumberValidator {

    public static void validatenumber(String phone) {

        if (phone.contains("+") || phone.contains("8")) {
            final String phonemod = phone.replaceAll("[^\\p{Digit}+]", "");
            final char[] charphone = phonemod.toCharArray();
            if ((charphone[0] == '+' && charphone[1] == '7' && charphone.length == 12) || (charphone[0] == '8' && charphone.length == 11)) {
                System.out.print("Введён корректный номер телефона ");
                System.out.print(charphone);
            } else {
                System.out.println("Введён некорректный номер телефона");
            }
        } else {
            System.out.println("Введён некорректный номер телефона");
        }
    }
}
