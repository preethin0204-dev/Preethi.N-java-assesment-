// Base (Parent) Class
class Animal {
    protected String name;

    // Constructor for Animal
    public Animal(String name) {
        this.name = name;
    }

    // Common method for all animals
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Generic sound method to be overridden
    public void sound() {
        System.out.println(name + " makes a generic sound.");
    }
}

// Subclass 1: Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call parent constructor
    }

    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    // Unique method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

// Subclass 2: Rabbit
class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name); // Call parent constructor
    }

    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println(name + " makes a soft squeak.");
    }

    // Unique method specific to Rabbit
    public void hop() {
        System.out.println(name + " is hopping around happily!");
    }
}

// Main Execution Class
public class AnimalHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("--- Animal Hierarchy Demonstration ---");

        // Create a Dog object
        Dog myDog = new Dog("Buddy");
        myDog.eat();
        myDog.sound();
        myDog.fetch();

        System.out.println();

        // Create a Rabbit object
        Rabbit myRabbit = new Rabbit("Thumper");
        myRabbit.eat();
        myRabbit.sound();
        myRabbit.hop();
    }
}
