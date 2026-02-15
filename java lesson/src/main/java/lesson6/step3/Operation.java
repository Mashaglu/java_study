package lesson6.step3;

public enum Operation {
    ADD("Сумма"),
    SUB("Разница"),
    MUL("Умножение"),
    DIV("Деление");

    private final String value;
    Operation(String value) {
        this.value = value;
    }

    String getValue() {
        return value;
    }

    public static Operation from(String operation) {
        return Operation.valueOf(operation.trim().toUpperCase());
    }
}
