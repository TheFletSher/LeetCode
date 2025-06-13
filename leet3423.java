public class leet3423 {
    public static int maxAdjacentDistance(int[] nums) {
        int diff = Math.abs(nums[0] - nums[nums.length - 1]);

        for (int i = 0; i < nums.length - 1; i++) {
            int currDiff = Math.abs(nums[i] - nums[i + 1]);
            if (currDiff > diff) {
                diff = currDiff;
            }
        }

        return diff;
    }
}
