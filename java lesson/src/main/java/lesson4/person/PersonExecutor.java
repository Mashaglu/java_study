package lesson4.person;

public class PersonExecutor {
    public static void main(String[] args) {
        Person student = new Student("Ivan", 19, "ivan@gmail.com");
        System.out.println(student.getName());

        Person qa = new QAEng("Денис", 34, "playboy@gmail.com");

        Person dev = new Developer("Маша", 22, "masha@gmail.com");
    }
}
