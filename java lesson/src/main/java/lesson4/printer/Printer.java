package lesson4.printer;

public interface Printer {

    void print(String message);

    default void clear() {
        System.out.println("Printer is clearing");
    }
}
