package Homework.dz_4.part2;

/*Создать абстрактный класс Student с полями:
a) String name;
b) String subject;
c) int course;
d) double averageGrade;
2.1. создать для всех полей Getters and Setters;
2.2. Создать конструктор без и со всеми параметрами;
2.3. Реализовать классы (студент физического факультета StudentPhysicsFaculty, StudentChemistryFaculty, StudentMathFaculty, StudentHistoryFaculty) наследующие абстрактный класс Student;
 */
public abstract class Student {
    private String name;
    private String subject;
    private int course;
    private double averageGrade;


    public Student(String name, String subject, int course, double averageGrade) {
        this.name = name;
        this.subject = subject;
        this.course = course;
        this.averageGrade = averageGrade;
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
