public class StudentResultChecker {
    public static void main(String[] args) {
        // Example student marks (Change this value to test)
        int marks = 95; 
        
        // Define standard passing mark
        int passingMark = 40;

        System.out.println("--- Student Examination Result ---");
        System.out.println("Marks Obtained : " + marks);

        // 1. Check if the student has passed or failed
        if (marks >= passingMark) {
            System.out.println("Result Status  : PASSED");
        } else {
            System.out.println("Result Status  : FAILED");
        }

        // 2. Assign Grade A for marks above 90
        if (marks > 90) {
            System.out.println("Grade Assigned : A (Excellent!)");
        } else {
            System.out.println("Grade Assigned : B, C, or Below (Marks are 90 or lower)");
        }
    }
}
