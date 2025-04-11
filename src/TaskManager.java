import java.util.*;

// let's create the custom exception

class InvalidTaskException extends IllegalArgumentException {
    public InvalidTaskException(String message) {
        super(message);
    }
}



public class TaskManager {

    // Add a task
    public void addTask(List<String> tasks, String task) {
        if (task == null || task.trim().isEmpty()) {
            throw new InvalidTaskException("Error: Task cannot be empty!");
        }
        tasks.add(task);
    }
    //sorting alphabetically using collections
    public void sortTasks(List<String> tasks) {
        Collections.sort(tasks);
    }

    // Search for a specific task
    public int searchTask(List<String> tasks, String target) {
        return tasks.indexOf(target);
    }
    // Remove a task
    public void removeTask(List<String> tasks, String task) {
        if (!tasks.remove(task)) {
            System.out.println(" Task not found!");
        }
    }
    // Get a task at specific index
    public String getTask(List<String> tasks, int index) {
        try {
            return tasks.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!");
            return "nothing";
        }
    }

}
