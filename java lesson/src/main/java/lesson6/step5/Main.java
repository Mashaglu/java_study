package lesson6.step5;

import lesson3.Calculator;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(5);

        System.out.println(CalculateSquare.calc(circle));
        System.out.println(CalculateSquare.calc(square));
    }
}
