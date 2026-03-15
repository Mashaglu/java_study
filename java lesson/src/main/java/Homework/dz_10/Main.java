package Homework.dz_10;

import java.time.LocalDate;
import java.util.*;

/*
(не используем циклы)
1. Дан список объектов 10-ти CorporateProductCredit (UUID id, Long statusId, Long typeId, boolean active, LocalDate exprationTime) включая дубликаты по полям (statusId, typeId, active, expirationTime) => превратить в список без дубликатов в отсортированном виде по expirationTime;
2. Дан список сток (10 шт.) с повторами, реализовать метод boolean allItemsAreUnique(List<String> list) который проверяет есть ли дубликаты в списке.
*/
public class Main {
    public static void main(String[] args) {

        final List<CorporateProductCredit> productlist = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            UUID id = UUID.randomUUID();
            Long statusId = random.nextLong(2);
            Long typeId = random.nextLong(2);
            boolean active = random.nextBoolean();
            LocalDate expirationTime = LocalDate.now().plusDays(random.nextInt(3));
            productlist.add(new CorporateProductCredit(id, statusId, typeId, active, expirationTime));
        }
        System.out.println(productlist.toString());
        final Set<CorporateProductCredit> set = new HashSet<>(productlist);
        final List<CorporateProductCredit> sortList = new ArrayList<>(set);
        sortList.sort(Comparator.comparing(CorporateProductCredit::getExpirationTime));
        System.out.println(sortList.toString());

        final List<String> textlist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String word = "";
            for (int j = 0; j < 3; j++) {
                char letter = (char) (random.nextInt(65, 67));
                word += letter;
            }
            textlist.add(word);
        }
        System.out.println(textlist.toString());
        allItemsAreUnique(textlist);
    }

    public static boolean allItemsAreUnique(List<String> list) {
        final Set<String> textSet = new TreeSet<>(list);
        System.out.println("Уникальный список: " + textSet);
        if (textSet.size() == list.size()) {
            System.out.println("Дубликатов нет ");
            return true;
        } else {
            System.out.println("Дубликаты есть ");
            return false;
        }
    }
}
