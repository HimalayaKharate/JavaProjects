import application.Task;
import application.TaskManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("""
                    1. Add Task
                    2. Delete Task
                    3. List Task
                    4. Show Task
                    5. Update Task
                    6. Mark Done""");

            Scanner s = new Scanner(System.in);
            int id;
            switch (s.nextInt()){
                case 1:
                    TaskManager.addTask();
                    TaskManager.listTasks();
                    break;
                case 2:
                    System.out.print("Enter the id of the task you want to delete : ");
                    id = s.nextInt();
                    TaskManager.deleteTask(id);
                    TaskManager.listTasks();
                    break;
                case 3:
                    TaskManager.listTasks();
                    break;
                case 4:
                    System.out.print("Enter the id of the task you want to see : ");
                    id = s.nextInt();
                    TaskManager.showTask(id);
                    break;
                case 5:
                    System.out.print("Enter the id of the task you want to see : ");
                    id = s.nextInt();
                    TaskManager.updateTask(id);
                    TaskManager.showTask(id);
                    break;
                case 6:
                    System.out.print("Enter the id of the task you want to see : ");
                    id = s.nextInt();
                    TaskManager.markDone(id);
                    TaskManager.showTask(id);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}