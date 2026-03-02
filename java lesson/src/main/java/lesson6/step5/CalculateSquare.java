package lesson6.step5;

public class CalculateSquare {

    public static double calc(Object shape) {

        if (shape instanceof Circle circle) {
            return Math.PI * Math.pow(circle.getRadius(), 2);
        }

        if (shape instanceof Square square) {
            return Math.pow(square.getSide(), 2);
        }
        return 0;
    }
}
