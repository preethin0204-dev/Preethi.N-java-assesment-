// Base (Parent) Class
class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Method returning a string description
    public String getDescription() {
        return "Generic Vehicle - Brand: " + brand;
    }
}

// Subclass 1: Car (Inherits from Vehicle)
class Car extends Vehicle {
    protected int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    // Overriding the string-returning method
    @Override
    public String getDescription() {
        return "Car - Brand: " + brand + ", Doors: " + doors;
    }
}

// Subclass 2: ElectricCar (Inherits from Car)
class ElectricCar extends Car {
    private int batteryRangeKm;

    public ElectricCar(String brand, int doors, int batteryRangeKm) {
        super(brand, doors);
        this.batteryRangeKm = batteryRangeKm;
    }

    // Overriding the string-returning method further down the hierarchy
    @Override
    public String getDescription() {
        return "Electric Car - Brand: " + brand + ", Doors: " + doors + ", Battery Range: " + batteryRangeKm + " km";
    }
}

// Main Execution Class
public class MethodOverridingDemo {
    public static void main(String[] args) {
        System.out.println("--- Method Overriding with Inheritance ---");

        // Creating objects for each level of the hierarchy
        Vehicle genericVehicle = new Vehicle("Yamaha");
        Vehicle myCar = new Car("Toyota", 4);
        Vehicle myElectricCar = new ElectricCar("Tesla", 4, 500);

        // Demonstrating dynamic method dispatch / overriding
        System.out.println(genericVehicle.getDescription());
        System.out.println(myCar.getDescription());
        System.out.println(myElectricCar.getDescription());
    }
}
