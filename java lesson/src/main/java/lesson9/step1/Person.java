package lesson9.step1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Person {
    private String firstname;
    private String lastname;
    private int age;
    private String email;

    /**
     * Задает имя пользователя.
     * Значение не должно быть пустым, если пустое кидает ошибку.
     */
    public void setFirstname(String firstname) {
        if (firstname == null || firstname.isEmpty()) {
            throw new IllegalArgumentException("Имя пустое");
        }
        this.firstname = firstname;
    }

    /**
     * Задает фамилию пользователя.
     * Значение не должно быть пустым, если пустое кидает ошибку.
     */
    public void setLastname(String lastname) {
        if (lastname == null || lastname.isEmpty()) {
            throw new IllegalArgumentException("Фамилия пустая");
        }
        this.lastname = lastname;
    }

    /**
     * Задает возраст пользователя.
     * Значение должно быть в диапазоне (0; 100), иначе кидаем ошибку.
     */
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Неверный возраст");
        }
        this.age = age;
    }
    /**
     * Задает email пользователя.
     * Значение не должно быть пустым и должно содержать символ "@", иначе кидаем ошибку.
     */
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email невалидный формат");
        }
        this.email = email;
    }
}
