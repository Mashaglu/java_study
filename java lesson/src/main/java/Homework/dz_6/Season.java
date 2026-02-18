package Homework.dz_6;


public enum Season {
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень"),
    WINTER("Зима");

    private final String rusName;

    Season(String rusName) {
        this.rusName = rusName;
    }

    public String getRusName() {
        return rusName;
    }

}
