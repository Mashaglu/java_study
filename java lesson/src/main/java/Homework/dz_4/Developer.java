package Homework.dz_4;

public class Developer implements Employee {
    private String taskName;

    public Developer() {
    }

    public Developer(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void doTask() {
        System.out.println("Маша разработчик взяла в работу задачу " + taskName);
    }

    @Override
    public double getSalary() {
        return 9999999;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getName() {
        return "Маша разработчик";
    }

    @Override
    public String getTask() {
        return taskName;
    }
}
