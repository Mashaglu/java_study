package Homework.dz_4;

public class SystemAnalitic implements Employee {
    private String taskName;

    public SystemAnalitic() {
    }

    public SystemAnalitic(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void doTask() {
        System.out.println("Петя аналитик взял в работу задачу " + taskName);
    }

    @Override
    public double getSalary() {
        return 100;
    }

    @Override
    public void setTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String getName() {
        return "Петя аналитик";
    }

    @Override
    public String getTask() {
        return taskName;
    }
}
