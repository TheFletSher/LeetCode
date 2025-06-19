import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1, total = 0;
        // No negative numbers or zeros
        if (nums[right] + nums[left] > nums[right]) return new ArrayList<>(0);

        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();

        // Loop through for pairs
        while (right - left > 1) {
            // number to find
            int need = - (nums[right] - nums[left]);
            // can't work
            if (need >= nums[right]) {
                if (right - 1 != left && nums[right - 1] == need) {
                    pairs.add(new ArrayList<>(List.of(nums[left], nums[right - 1], nums[right])));
                }
                right-=2;
                left++;
            } else if (need <= nums[left]) {
                if (left + 1 != right && nums[left + 1] == need) {
                    pairs.add(new ArrayList<>(List.of(nums[left], nums[left + 1], nums[right])));
                }
                left+=2;
                right--;
            } else {
                for (int i = left; i < right - 1; i++) {
                    if (nums[i] == need) {
                        pairs.add(new ArrayList<>(List.of(nums[left], nums[i], nums[right])));
                        break;
                    } else if (nums[i] > need) break;
                }
            }
        }

    }
}
