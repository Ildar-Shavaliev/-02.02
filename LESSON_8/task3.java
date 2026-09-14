// импортируйте нужные пакеты

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Оплатить интернет.", TaskPriority.HIGH));
        tasks.add(new Task("Сходить в парикмахерскую.", TaskPriority.LOW));
        tasks.add(new Task("Выбрать подарок подруге на ДР.", TaskPriority.MEDIUM));
        tasks.add(new Task("Купить билеты в театр.", TaskPriority.MEDIUM));
        tasks.add(new Task("Посетить вебинар по английскому языку.", TaskPriority.HIGH));
        tasks.add(new Task("Купить пылесос.", TaskPriority.LOW));

        System.out.println("Задачи с наивысшим приоритетом на сегодня:");
        for (Task task : tasks) {
            if (task.getPriority() == TaskPriority.HIGH) {
                System.out.println(task.getDescription());
            }
        } // цикл for для поиска задач
    }
}
class Task {

    private TaskPriority priority; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(String description, TaskPriority priority) {
        this.description = description;
        this.priority = priority;
    }// добавьте конструктор класса

    public TaskPriority getPriority() {
        return priority;
    } // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }
}
enum TaskPriority {
    HIGH,
    MEDIUM,
    LOW
}
