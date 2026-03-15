package Homework.dz_11;

/*1. Дан список автомобилей Car(модель, цена $, цвет, год выпуска, количество владельцев) минимум 10 шт., задачи:
1.1. Отобрать список машин младше 2020 года выпуска;
1.2. Заменить цвет авто, цена < 5000$;
1.3. Преобразовать цены в руб;
1.4. Повысить цены на авто старше 2020 на 10000 руб;
1.5. Вывести инфу об авто в консоль;
1.6. Перебрать список, найти первое авто с ценой < 150000 руб, если нет выбросить CarNotFoundException(“Авто с ценой < 150000 не обнаружено”);
1.7. Через any-all-non-match проверить условие цена > 2000000 и 1 владелец и год выпуска > 2016;
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        final List<Car> cars = Car.generateCars(10);
        System.out.println("Изначальный список машин:");
        cars.forEach(System.out::println);

        final List<Car> oldCars = cars.stream()
                .filter(car -> car.getYear() > 2020)
                .toList();
        System.out.println("Список машин младше 2020 :" + oldCars);

        System.out.println("Список машин поменявших цвет :");
        cars.stream()
                .filter(car -> car.getPrice() < 5000)
                .peek(car -> car.setColor("Pink"))   // меняем цвет прямо в потоке
                .forEach(System.out::println);

        cars.forEach(car ->
                car.setPrice(car.getPrice() * 80.0)
        );

        cars.stream()
                .filter(car -> car.getYear() < 2020)
                .forEach(car ->
                        car.setPrice(car.getPrice() + 10000)
                );

        System.out.println("Список машин:");
        cars.forEach(System.out::println);

        Car cheapCar = cars.stream()
                .filter(car -> car.getPrice() < 150000)
                .findFirst()
                .orElseThrow(() ->
                        new CarNotFoundException("Авто с ценой < 150000 не обнаружено")
                );
        System.out.println("Авто с ценой < 150000 : " + cheapCar);

// Строка для проверки условия
// cars.add(new Car("Hyundai", "White", 2000001, 2025, 1));

        final Predicate<Car> carPredicate = car ->
                car.getPrice() > 2_000_000 &&
                        car.getOwners() == 1 &&
                        car.getYear() > 2016;

        System.out.println("Есть ли хоть одна машина подходящая под условия :" + cars.stream().anyMatch(carPredicate));
        System.out.println("Все ли машины подходят под условия :" + cars.stream().allMatch(carPredicate));
        System.out.println("Все ли машины не подходят под условия :" + cars.stream().noneMatch(carPredicate));
    }
}
