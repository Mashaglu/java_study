package lesson11.step4;

import java.util.Comparator;

public class StudentBirthDayComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getDateOfBirth().isAfter(o2.getDateOfBirth())) {
            return -1;
        } else if (o1.getDateOfBirth().isBefore(o2.getDateOfBirth())) {
            return 1;
        }
        return 0;
    }
}
