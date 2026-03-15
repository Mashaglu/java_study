package lesson9.step1;

public class PersonBuilder {
    public static void main(String[] args) {
        // Проверка работы валидации класса Person.
        try {
            final var person = new Person();
            // передаём неправильный email
            person.setEmail("email");
            System.out.println(person);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
