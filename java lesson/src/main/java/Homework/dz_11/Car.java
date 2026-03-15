package Homework.dz_11;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter

public class Car {
    private String model;
    private String color;
    private double price;
    private Integer year;
    private Integer owners;

    public static List<Car> generateCars(int count) {
        Random random = new Random();
        final String[] models = {
                "Toyota", "BMW", "Audi", "Ford", "Mercedes",
                "Kia", "Hyundai", "Skoda", "Volkswagen", "Lada"};
        final String[] colors = {
                "Black", "White", "Red", "Blue", "Gray", "Green", "Silver"};
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String model = models[random.nextInt(models.length)];
            String color = colors[random.nextInt(colors.length)];
            double price = random.nextInt(2_100_000) / 80.0;
            Integer year = 2010 + random.nextInt(16);
            int owners = random.nextInt(4);
            cars.add(new Car(model, color, price, year, owners));
        }
        return cars;
    }
}



