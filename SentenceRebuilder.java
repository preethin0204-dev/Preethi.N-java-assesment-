public class SentenceRebuilder {
    public static void main(String[] args) {
        String originalSentence = "learning java is an exciting journey";
        
        // 1. Split the sentence into words using space as a delimiter
        String[] words = originalSentence.split(" ");
        
        // 2. Rebuild the sentence in a new format (Uppercase with hyphens)
        StringBuilder rebuilt = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            // Append the word in uppercase
            rebuilt.append(words[i].toUpperCase());
            
            // Add a hyphen between words (but not after the last word)
            if (i < words.length - 1) {
                rebuilt.append("-");
            }
        }

        // Print the results
        System.out.println("--- Sentence Split & Rebuild ---");
        System.out.println("Original Sentence : " + originalSentence);
        System.out.println("Total Words       : " + words.length);
        System.out.println("Rebuilt Format    : " + rebuilt.toString());
    }
}
