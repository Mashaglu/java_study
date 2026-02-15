package lesson6.step1;

public class MainRunner {
    public static void main(String[] args) {
        Status status = Status.SUCCESS;
        System.out.println(status);

        Gender gender = Gender.FEMALE;
        System.out.println(gender);
        System.out.println(gender.getValue());

        Seasons seasons = Seasons.SPRING;
        System.out.println(String.format("%s начиная с месяца %d - %d",
                seasons.getRusName(),
                seasons.getStartMonthNumber(),
                seasons.getEndMonthNumber()));
    }
}
