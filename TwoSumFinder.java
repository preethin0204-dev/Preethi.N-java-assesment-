import java.util.Arrays;
import java.util.HashMap;

public class TwoSumFinder {
    
    public static int[] findTwoSum(int[] nums, int target) {
        // Map to store value -> index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement exists in our map, we found our pair
            if (map.containsKey(complement)) {
                int firstIndex = map.get(complement);
                int secondIndex = i;
                
                // Return indices in ascending order
                return new int[] { 
                    Math.min(firstIndex, secondIndex), 
                    Math.max(firstIndex, secondIndex) 
                };
            }
            
            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }
        
        // Return [-1, -1] if no pair exists
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = findTwoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
