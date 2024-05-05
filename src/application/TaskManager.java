package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    private static int id = 0;
    private static List<Task> listOfTasks = new ArrayList<>();

    public static void addTask(){
        Scanner s = new Scanner(System.in);
        System.out.print("""
                Creating Task.....
                Enter the title of the Task : """);
        String title = s.nextLine();
        System.out.print("Enter the Description of the task : ");
        String description = s.nextLine();
        listOfTasks.add(new Task(++id,description , title));
    }

    public static void listTasks(){
        System.out.println("Listing the tasks....");
        for(Task i : listOfTasks){
            System.out.printf("%d %s%n", i.getId(), i.getTitle());
        }
    }

    public static void showTask(int id){
        for(Task i : listOfTasks){
            if(i.getId() == id){
                System.out.println(i);
                return;
            }
        }
    }

    public static void deleteTask(int id){
        for(int i = 0 ; i < listOfTasks.size(); i++){
            if(listOfTasks.get(i).getId() == id){
                listOfTasks.remove(i);
                return;
            }
        }
    }

    public static void updateTask(int id){
        for(Task t : listOfTasks){
            if(t.getId() == id){
                Scanner s = new Scanner(System.in);
                System.out.print("""
                Updating Task....
                Enter the new title : """);
                String title = s.nextLine();
                System.out.print("Enter the new Description : ");
                String desc = s.nextLine();
                t.UpdateTask(title,desc);
                return;
            }
        }
    }

    public static void markDone(int id){
        for (Task t : listOfTasks){
            if(t.getId() == id){
                t.setDone();
                return;
            }
        }
    }

}
