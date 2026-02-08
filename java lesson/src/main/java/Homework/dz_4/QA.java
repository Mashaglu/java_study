package Homework.dz_4;

import java.util.Scanner;

public class QA implements Employee {
    private String taskName;
    Scanner sc = new Scanner(System.in);

    public QA() {
    }

    public QA(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void doTask() {
        System.out.println("Вася тестировщик взял в работу задачу " + taskName);
    }

    @Override
    public double getSalary() {
        return 900000;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = sc.next();

    }

    @Override
    public String getName() {
        return "Вася тестировщик";
    }

    @Override
    public String getTask() {
        return taskName;
    }
}
