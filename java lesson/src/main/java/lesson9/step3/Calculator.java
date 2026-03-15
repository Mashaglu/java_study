package lesson9.step3;

/**
 * Интерфейс для простого калькулятора.
 * Определяет базовые арифметические операции:
 * сложение, вычитание, умножение и деление.
 */
public interface Calculator {
    double add(double a, double b);
    double sub(double a, double b);
    double mul(double a, double b);
    double div(double a, double b);
}
