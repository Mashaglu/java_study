package Homework.dz_4;

public class SystemAnalitic implements Employee {
    private String taskName;
    private String name;

    public SystemAnalitic() {
    }

    public SystemAnalitic(String taskName, String name) {
        this.taskName = taskName;
        this.name = name;
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
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getTask() {
        return taskName;
    }
}
