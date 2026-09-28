public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Define the radius of the circle
        double radius = 7.5; // You can change this value as needed

        // Calculate the area: Area = pi * r^2
        double area = Math.PI * Math.pow(radius, 2);
        
        // Alternatively, you can use standard multiplication:
        // double area = Math.PI * radius * radius;

        // Print the results
        System.out.println("--- Circle Area Calculation ---");
        System.out.println("Radius : " + radius);
        System.out.println("Area   : " + area);
        
        // Formatted output to show 2 decimal places
        System.out.printf("Area (Formatted): %.2f\n", area);
    }
}
