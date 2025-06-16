public class leet2016 {
    public static void main(String[] args) {
        int[] nums = {87,68,91,86,58,63,43,98,6,40};
        System.out.println();
        System.out.println(maximumDifference(nums));
    }

    public static int maximumDifference(int[] nums) {
        if (nums.length == 1) {
            return -1;
        }

        // base result
        int result = -1;

        // min / max start
        int min = nums[0], max = nums[0];

        // Looping through
        for (int i = 0; i < nums.length; i++) {
            // Bigger number becomes max
            if (nums[i] > max) {
                max = nums[i];
            // If it ever decreases
            } else {
                // new max found, have result
                if (max != min) result = Math.max(result, max - min);
                // if current number is less than old min
                if (nums[i] < min) {
                    min = nums[i];
                    max = nums[i];
                }
            }
        }

        if (max == min) return result;
        return Math.max(result, max - min);
    }
}
