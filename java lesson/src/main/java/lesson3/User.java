package lesson3;

public class User {

    // поле константа, при условии его инициализации в конструкторе
    private final  String firstName;
    // поле константа, при условии его инициализации в конструкторе
    private final String lastName;
    private final String password;


    public User(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
    // Нет возможности создать конструктор без параметров
    //    public User() {
    //    }

    // Есть только возможность генерировать Getters
    // по скольку поля присвоят значения при создании объекта через конструктор
    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getPassword() {return "******";}


}
