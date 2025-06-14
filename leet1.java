import java.util.Arrays;

public class leet1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int need = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == need) {
                    int[] pair = {i, j};
                    return pair;
                }
            }
        }

        int[] pair = {-1, -1};
        return pair;
    }
}
