package lesson5.step3;

public class SmartPhoneApp {
    public static void main(String[] args) {
       SmartPhone samsungS26Ultra = new SmartPhone(
               "Samsung S26 Ultra",
               "Samsung",
               85_000);

        System.out.println(samsungS26Ultra);

        SmartPhone samsungS26Ultra_1 = new SmartPhone(
                "Samsung S26 Ultra",
                "Samsung",
                85_000);

        final var samsungS26Ultra_2 = samsungS26Ultra_1.clone();

        // сравнение ссылок
        System.out.println("Сравнение ссылок = " + (samsungS26Ultra_1 == samsungS26Ultra));

        System.out.println("Сравнение equals() = " + (samsungS26Ultra_1.equals(samsungS26Ultra)));

        System.out.println(samsungS26Ultra_2);

        // 1. Правило: если hash коды объектов не равны, то и объекты не равны;
        // 2. Равенство hash кодов не гарантирует равенство объектов;
        // 3. Равенство по equals дает гарантию равенства объектов;

    }
}
