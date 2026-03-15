package lesson9.step3;

public class CalculatorImpl implements Calculator {

    /**
     * Сложение, складывает два числа.
     * Возвращает сумму a и b
     */
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Вычитание, вычитает второе число из первого.
     * Возвращает результат a - b
     */
    @Override
    public double sub(double a, double b) {
        return a - b;
    }

    /**
     * Умножение, умножает два числа.
     * Возвращает результат a * b
     */
    @Override
    public double mul(double a, double b) {
        return a * b;
    }

    /**
     * Деление, делит первое число на второе.
     * Возвращает результат a / b
     * Кидает ArithmeticException если деление невозможно
     */
    @Override
    public double div(double a, double b) {
        try {
            return a / b;
        } catch (Exception ex) {
            // ловим любые ошибки и оборачиваем в ArithmeticException
            throw new ArithmeticException(ex.getMessage());
        }
    }
}
