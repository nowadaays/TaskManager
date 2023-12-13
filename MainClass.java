import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добаветь задачу!");
            System.out.println("2. Показать задачу!");
            System.out.println("3. Отметить задачу как выполненную!");
            System.out.println("0. Выйти!");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите название задачи!");
                    String taskName = scanner.nextLine();
                    System.out.println("Введите описание задачи!");
                    String taskDescription = scanner.nextLine();
                    taskManager.addTask(taskName, taskDescription, false);
                    break;
                case 2:
                    taskManager.displayTask();
                    break;
                case 3:
                    System.out.println("Введите номер задачи(индекс) для отметки выполнения!");
                    int taskIndex = scanner.nextInt();
                    taskManager.markTaskAsComplete(taskIndex);
                    break;
                case 0:
                    System.out.println("Выход;)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Некорректный ввод!");
            }
        }
    }
}