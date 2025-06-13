import java.util.HashMap;
import java.util.Map;

public class leet3 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        Map<Character, Integer> count = new HashMap<>();

        // right side as i
        for (int right = 0; right < s.length(); right++) {
            // right character
            char c = s.charAt(right);

            // right character count
            count.put(c, count.getOrDefault(c, 0) + 1);
            
            // Found duplicate
            while (count.get(c) > 1) {
                // Move left side
                char leftChar = s.charAt(left);

                // Decrease count by 1
                count.put(leftChar, count.get(leftChar) - 1);
                left++;
            }
            
            // Distance between left and right + 1
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;  
    }
}
