import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> pairs = threeSum(nums);

        
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int right = nums.length - 1;
        // No negative numbers or zeros
        if (nums[right] + nums[0] > nums[right]) return new ArrayList<>(0);

        List<List<Integer>> pairs = new ArrayList<>();

        /*
         * Follow the left only for as long as it is zero or negative.
         * Bring the right down until it either the right pairing or move along
         */
        for (int left = 0; left < nums.length; left++) {
            if (nums[left] > 0 || right - left <= 1) break;

            int need = nums[right] - nums[left];
            if (need > nums[right]) {
                while (need > nums[right]) {
                    left++;
                    if (right <= left) break;
                    need = nums[right] - nums[left];
                }
            } else if (need < nums[left]) {
                while (need < nums[left]) {
                    right--;
                    if (right <= left) break;
                    need = nums[right] - nums[left];
                }
            }
            int offset = 1;
            while (right > left) {
                
            }
        }

        return pairs;
    }
}
