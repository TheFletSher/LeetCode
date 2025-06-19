import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        // No negative numbers or zeros
        if (nums[right] + nums[left] > nums[right]) return new ArrayList<>(0);

        List<List<Integer>> pairs = new ArrayList<>();

        // Loop through for pairs
        while (right - left > 1) {
            // number to find
            int need = -1 * (nums[right] - nums[left]);
            // can't work without duplicates
            if (need >= nums[right]) {
                if (right - 1 != left && nums[right - 1] == need) {
                    pairs.add(new ArrayList<>(List.of(nums[left], nums[right - 1], nums[right])));
                    while (nums[right] == need) {
                        right--;
                        if (right <= left) return pairs;
                    }
                }
                left++;
            } else if (need <= nums[left]) {
                if (left + 1 != right && nums[left + 1] == need) {
                    pairs.add(new ArrayList<>(List.of(nums[left], nums[left + 1], nums[right])));
                    while (nums[left] == need) {
                        left++;
                        if (left >= right) return pairs;
                    }
                }
                right--;
            // Look for needed number between 
            } else {
                for (int i = left; i < right - 1; i++) {
                    if (nums[i] == need) {
                        pairs.add(new ArrayList<>(List.of(nums[left], nums[i], nums[right])));
                        break;
                    } else if (nums[i] > need) break;
                }
            }
        }
        return pairs;
    }
}
