import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnagramGroupCounter {
    
    public static int countAnagramicGroups(List<String> strings) {
        Set<String> uniqueGroups = new HashSet<>();
        
        for (String s : strings) {
            // Convert string to character array and sort it
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            
            // The sorted string acts as a unique key for the anagram group
            String canonicalForm = new String(chars);
            uniqueGroups.add(canonicalForm);
        }
        
        return uniqueGroups.size();
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        int groupCount = countAnagramicGroups(words);
        
        System.out.println("Number of anagramic groups: " + groupCount);
    }
}
