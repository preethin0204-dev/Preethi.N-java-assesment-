public class VowelCounter {
    public static void main(String[] args) {
        String originalText = "Welcome to Java Programming 2026!";
        int vowelCount = 0;
        
        // Convert the string to lowercase to handle both uppercase and lowercase vowels easily
        String text = originalText.toLowerCase();
        
        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        // Print the results
        System.out.println("--- Vowel Counter ---");
        System.out.println("Original String : " + originalText);
        System.out.println("Total Vowels    : " + vowelCount);
    }
}
