import java.util.HashSet;
import java.util.Set;

public class DistinctAbsoluteCounter {
    
    public static int countDistinctAbs(int[] nums) {
        Set<Integer> distinctValues = new HashSet<>();
        
        for (int num : nums) {
            // Compute the absolute value and add it to the set
            // Note: Math.abs(Integer.MIN_VALUE) remains negative due to overflow, 
            // but for standard integer ranges, this works perfectly.
            int absVal = Math.abs(num);
            distinctValues.add(absVal);
        }
        
        return distinctValues.size();
    }

    public static void main(String[] args) {
        int[] nums = {-5, -1, 0, 1, 5};
        int result = countDistinctAbs(nums);
        
        System.out.println("Number of distinct absolute values: " + result); 
        // Output will be 3 (values: 5, 1, 0)
    }
}
