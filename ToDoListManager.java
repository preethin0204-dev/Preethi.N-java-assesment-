import java.util.ArrayList;

public class ToDoListManager {
    public static void main(String[] args) {
        // Create an ArrayList to store tasks
        ArrayList<String> tasks = new ArrayList<>();

        // 1. Adding tasks
        tasks.add("Buy groceries");
        tasks.add("Finish coding assignment");
        tasks.add("Go for a run");

        // 2. Iterating over tasks (Traditional For Loop)
        System.out.println("--- Current To-Do List ---");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }

        // 3. Removing a task (by object value or index)
        tasks.remove("Go for a run"); // Removes by value
        // tasks.remove(0);           // Removes by index

        // Iterating using a For-Each Loop
        System.out.println("\n--- Updated To-Do List ---");
        int index = 1;
        for (String task : tasks) {
            System.out.println(index + ". " + task);
            index++;
        }
    }
}
