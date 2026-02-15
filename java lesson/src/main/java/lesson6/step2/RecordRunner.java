package lesson6.step2;

public class RecordRunner {
    public static void main(String[] args) {
        final Person ivan = new Person("Ivan", 33, "QA", true);
        final Person ivan1 = new Person("Ivan", 33, "QA", true);

        System.out.println(ivan);
        System.out.println(ivan.age());
        System.out.println(ivan.name());

        System.out.println(ivan.equals(ivan1));
    }
}
