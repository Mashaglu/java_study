package Homework.dz_4;

public class BusinessAnalitic implements Employee {
    private String taskName;

    public BusinessAnalitic() {
    }

    public BusinessAnalitic(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void doTask() {
        System.out.println("Коля б.аналитик взял в работу задачу " + taskName);
    }

    @Override
    public double getSalary() {
        return 80;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getName() {
        return "Коля б.аналитик";
    }

    @Override
    public String getTask() {
        return taskName;
    }
}
