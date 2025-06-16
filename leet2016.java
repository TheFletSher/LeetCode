public class leet2016 {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};
        System.out.println();
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        if (nums.length == 1) {
            return -1;
        }

        int result = -1;

        int left = 0, right = 0;
        // Loop through
        while (right < nums.length - 1) {
            // Move right as long as increasing
            while (nums[right] < nums[right + 1]) {
                right++;
                if (right + 1 == nums.length) break;
                System.out.println("MOVING: " + left + ", " + right);
            }
            // Update max difference
            if (left != right) {
                System.out.println("MAX: " + left + ", " + right);
                if (nums[right] - nums[left] != 0) {
                    result = Math.max(result, nums[right] - nums[left]);
                }
            }
            System.out.println(result);

            // Break point
            if (right + 1 == nums.length) break;

            // Only move left if new minimum
            if (nums[right + 1] < nums[left]) {
                System.out.println("MIN: " + nums[right + 1] + ", " + nums[left]);
                left = right + 1;
                right++;
            } else {
                right++;
            }
        }

        return result;
    }
}
