package lesson4;

public class StartApp {
    public static void main(String[] args) {
        Animal cat = new Cat("Сима", "Black", "ScotishFold", 11);
        Animal dog = new Dog("Барсик", "White", "Дворняга", 2);


        AnimalEditable cat1 = new Cat("Сима", "Black", "ScotishFold", 11);
        cat1.setAge(8);
        cat1.setColor("Gray");

    }
}
