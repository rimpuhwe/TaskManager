import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] arg){
        TaskManager manager = new TaskManager();
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        System.out.println("********************************");
        System.out.println("Let's get started with Arraylist");
        System.out.println("********************************");
        try {
            manager.addTask(arrayList, "Shopping groceries");
            manager.addTask(arrayList, "Meditation");
            manager.addTask(arrayList, "Team meeting");
            manager.addTask(arrayList, "Spotting out for relaxing");

        } catch (InvalidTaskException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("processed....");
        }


        manager.sortTasks(arrayList);
        System.out.println("Sorted Tasks: " + arrayList);

        int index = manager.searchTask(arrayList , "Shopping groceries");
        System.out.println( "Task found at index: " + index);

        manager.removeTask(arrayList, "Shopping groceries");
        System.out.println("The remaining list: " + arrayList);

        System.out.println("Trying to access index ...");
        String taskAtIndex = manager.getTask(arrayList, 3);
        System.out.println("Here you have "+ taskAtIndex);


    }

}
