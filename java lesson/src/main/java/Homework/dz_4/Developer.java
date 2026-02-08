package Homework.dz_4;

public class Developer implements Employee {
    private String taskName;
    private String name;

    public Developer() {
    }

    public Developer(String taskName, String name) {
        this.taskName = taskName;
        this.name = name;
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
