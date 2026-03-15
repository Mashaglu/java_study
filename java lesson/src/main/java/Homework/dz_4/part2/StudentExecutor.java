package Homework.dz_4.part2;

//*2.4. В классе StudentExecutor создать все 4 вида студентов и вывести все данные о них;

public class StudentExecutor {
    public static void main(String[] args) {

        Student st1 = new StudentPhysicsFaculty("Петя", "Физика", 3, 3.45);
        st1.setSubject("Music");
        System.out.println(st1.getName() + " " + st1.getSubject() + " " + st1.getCourse() + " " + st1.getAverageGrade());

        Student st2 = new StudentChemistryFaculty("Вася", "Химия", 5, 5.0);
        st2.setName("Даша");
        System.out.println(st2.getName() + " " + st2.getSubject() + " " + st2.getCourse() + " " + st2.getAverageGrade());

        Student st3 = new StudentHistoryFaculty("Саша", "История", 10, 1.0);
        st3.setCourse(1);
        System.out.println(st3.getName() + " " + st3.getSubject() + " " + st3.getCourse() + " " + st3.getAverageGrade());

        Student st4 = new StudentMathFaculty("Каша", "Математика", 1, 4.05);
        st4.setAverageGrade(4.09);
        System.out.println(st4.getName() + " " + st4.getSubject() + " " + st4.getCourse() + " " + st4.getAverageGrade());


    }
}
