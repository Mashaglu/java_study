package Homework.dz_4;

/*1. Создать интерфейс Employee с абстрактными методами:
а) void doTask(String taskName);
b) double getSalary();
c) void setTask(String taskName);
d) String getName();
e) String getTask();
1.2. Имплементировать интерфейс Employee в классах QA, SystemAnalitic, BusinessAnalitic, Developer;
1.3. В классе EmployeeExecutor создать все типы объектов QA, SystemAnalitic, BusinessAnalitic, Developer и вызвать методы:
a) добавить задачу на выполнение;
б) посмотреть задачу работника;
в) вывести – имя работника + таска + зп;
*/
public class EmployeeExecutor {
    public static void main(String[] args) {

        Employee emp1 = new QA();
        emp1.setTask("0");
        emp1.doTask();
        System.out.println("Имя: " + emp1.getName() + ", Задача: " + emp1.getTask() + ", Зарплата: " + emp1.getSalary() + "\n");

        Employee emp2 = new SystemAnalitic();
        emp2.setTask("Аналитика");
        emp2.doTask();
        System.out.println("Имя: " + emp2.getName() + ", Задача: " + emp2.getTask() + ", Зарплата: " + emp2.getSalary() + "\n");

        Employee emp3 = new BusinessAnalitic();
        emp3.setTask("Бизнес анализ");
        emp3.doTask();
        System.out.println("Имя: " + emp3.getName() + ", Задача: " + emp3.getTask() + ", Зарплата: " + emp3.getSalary() + "\n");

        Employee emp4 = new Developer();
        emp4.setTask("Разработка");
        emp4.doTask();
        System.out.println("Имя: " + emp4.getName() + ", Задача: " + emp4.getTask() + ", Зарплата: " + emp4.getSalary() + "\n");


    }


}
