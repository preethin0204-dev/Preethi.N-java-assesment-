import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        System.out.println("Original List: " + list);

        // 1. ACCESSING ELEMENTS
        System.out.println("\n--- Accessing Operations ---");
        System.out.println("First element (getFirst): " + list.getFirst());
        System.out.println("Last element (getLast): " + list.getLast());
        System.out.println("Element at index 2 (get): " + list.get(2));

        // 2. REMOVING ELEMENTS
        System.out.println("\n--- Removing Operations ---");
        
        // Remove by value
        list.remove("Banana"); 
        System.out.println("After remove(\"Banana\"): " + list);

        // Remove by index
        list.remove(0); // Removes "Apple"
        System.out.println("After remove(0): " + list);

        // Remove first and last specifically
        list.removeFirst(); // Removes "Cherry"
        System.out.println("After removeFirst(): " + list);

        list.removeLast();  // Removes "Date"
        System.out.println("After removeLast(): " + list);
    }
}
