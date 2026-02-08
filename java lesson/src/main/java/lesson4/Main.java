package lesson4;

public class Main {
    public  static void main(String[] args) {

        Calculator calculator = new CalculatorImpl();
        calculator.print();
        System.out.println(calculator.subtract(100, 10));

        Calculator jewishCalc = new JewishCalculatorImpl();
        jewishCalc.print();
        System.out.println(jewishCalc.subtract(100, 10));



    }
}
