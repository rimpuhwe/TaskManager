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
            manager.addTask(arrayList, "Write report");
            manager.addTask(arrayList, "Code review");
            manager.addTask(arrayList, "Team meeting");
            manager.addTask(arrayList, "");

        } catch (InvalidTaskException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation logged.");
        }

    }

}
