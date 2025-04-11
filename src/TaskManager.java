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

}
