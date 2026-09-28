public class StringMethodsDemo {
    public static void main(String[] args) {
        // Original string
        String message = "Hello, Java Programming!";

        // 1. length(): Returns the total number of characters in the string
        int strLength = message.length();

        // 2. toUpperCase(): Converts all characters in the string to uppercase
        String upperCaseStr = message.toUpperCase();

        // 3. contains(): Checks if a specific sequence of characters exists within the string
        boolean containsJava = message.contains("Java");

        // Printing the results
        System.out.println("--- String Methods Demonstration ---");
        System.out.println("Original String     : " + message);
        System.out.println("1. length()         : " + strLength);
        System.out.println("2. toUpperCase()    : " + upperCaseStr);
        System.out.println("3. contains('Java') : " + containsJava);
    }
}
