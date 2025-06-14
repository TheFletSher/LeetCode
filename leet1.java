import java.util.HashMap;

public class leet1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> pairs = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (pairs.containsKey(need)) {
                int[] pair = {pairs.get(need), i};
                return pair;
            }
            pairs.put(nums[i], i);
        }

        int[] pair = {-1, -1};
        return pair;
    }
}
