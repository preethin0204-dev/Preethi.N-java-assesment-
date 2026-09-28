class Book {
    String title;
    String author;
    double price;

    // Constructor 1: Takes title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0.0; // Default price if not provided
    }

    // Constructor 2: Takes title, author, and price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | Price: $" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating the first book using the 2-parameter constructor
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien");

        // Creating the second book using the 3-parameter constructor
        Book book2 = new Book("Atomic Habits", "James Clear", 15.99);

        // Displaying details for both objects
        book1.displayInfo();
        book2.displayInfo();
    }
}
