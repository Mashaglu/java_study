package Homework.dz_4;
/* 1. Создать интерфейс Employee с абстрактными методами:
а) void doTask(String taskName);
b) double getSalary();
c) void setTask(String taskName);
d) String getName();
e) String getTask();
 */

public interface Employee {
    void doTask();

    double getSalary();

    void setTask(String taskName);

    String getName();

    String getTask();

}
