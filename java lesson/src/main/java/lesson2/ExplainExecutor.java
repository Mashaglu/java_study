package lesson2;

public class ExplainExecutor {
    // метод запуска на выполнение
    public static void main(String[] args) {
        // создаем объект на основе конструктора без параметров
        // explain ссылка на объект типа Explain
        Explain explain = new Explain();

        // создаем объект на основе конструктора с параметрами
        Explain explain1 = new Explain(11, "Андрей", 2200.34);

        // Доступ к полям не имеющих модификатор private
        System.out.println("Поля объекта explain1");
        System.out.println(explain1.salary);
        System.out.println(explain1.name);
        System.out.println(explain1.isOld);

        // Объект explain создан через конструктор без параметров
        // все свойства (параметры объекта) заполняються дефолтными
        // double salary = 0.0 - примитивный тип
        // name = null - ссылочный тип строка
        // isOld = false - примитивный тип
        System.out.println("---------------------------------------------------------");
        System.out.println("Поля объекта explain");
        System.out.println(explain.salary);
        System.out.println(explain.name);
        System.out.println(explain.isOld);

        // Решение задачи 1.1.1. number в диапазоне [100, 1000];
        int number = 100;
        boolean result = number >= 100 && number <= 1000;
        System.out.println("number в диапазоне [100, 1000] : " + result);

        // Решение задачи 1.1.3. number только в диапазонах [1, 10] или [100, 300];
        int number2 = -10;
        boolean result2 = (number2 >= 1 && number2 <= 100) || (number2 >= 100 && number2 <= 300);
        System.out.println("number только в диапазонах [1, 10] или [100, 300] : " + result2);

        // Решение задачи 1.1.5. number кратное 5 и 7;
        int number3 = 100;
        boolean result3 = number3 % 5 == 0 && number3 % 7 == 0;
        System.out.println("number кратное 5 и 7 : " + result3);
    }
}
