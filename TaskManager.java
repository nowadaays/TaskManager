import java.util.List;
import java.util.ArrayList;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String name, String description, boolean isComplete) {
        Task newTask = new Task(name, description, isComplete);
        tasks.add(newTask);
        System.out.println("Задача добавленна!");
    }

    public void displayTask() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст , добавте задачу , для дальнейшего пользования!");
        } else {
            System.out.println("Ваш список задач");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private boolean isValidTaskIndex(int taskIndex) {
        return (taskIndex >= 0 && taskIndex < tasks.size());
    }

    public void markTaskAsComplete(int taskIndex) {
        if (isValidTaskIndex(taskIndex)) {
            Task task = tasks.get(taskIndex);
            task.markAsComplete();
            System.out.println("Задача отмечена как выполненная " + task);
        } else {
            System.out.println("Некоректный индекс задачи!");
        }
    }
}
