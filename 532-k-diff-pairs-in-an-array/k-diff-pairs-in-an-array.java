import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findPairs(int[] nums, int k) {
        // Absolute difference cannot be negative
        if (k < 0) return 0; 

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (k == 0) {
                // For k = 0, we need at least two of the same number
                if (freq >= 2) {
                    count++;
                }
            } else {
                // For k > 0, just look for (num + k). 
                // We don't check (num - k) to avoid double counting pairs.
                if (map.containsKey(num + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}