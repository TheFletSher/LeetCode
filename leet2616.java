import java.util.Arrays;
import java.util.HashSet;

public class leet2616 {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);

        HashSet<Integer> pairs = new HashSet<>();

        int left = 0;
        while (pairs.size() < p) {
            int maxDiff = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 2; i++) {
                if (pairs.contains(i)) {
                    i++;
                    continue;
                }
                int currDiff = Math.abs(nums[i] - nums[i + 1]);
                if (currDiff < maxDiff) {
                    maxDiff = currDiff;
                    left = i;   
                }
            }
            pairs.add(left);
        }

        int max = 0;
        for (int value : pairs) {
            max = Math.max(value, max);
        }

        return max;
    }
}