package lesson2;

// Краткое объяснение лекции
public class Explain {
    // Поля класса
    // видимости в пределах класса
    private int number;

    // видимость в пределах пакета lesson2
    String name;

    // глобальная видимость
    public boolean isOld;

    // видимость в классах наследниках
    protected double salary;

    // конструктор без параметров
    public Explain() {}

    // конструктор с параметрами
    public Explain(int number, String name, double salary) {
        this.number = number;
        this.name = name;
        this.salary = salary;
    }

    // конструктор с параметрами
    public Explain(String name) {
        this.name = name;
    }
}