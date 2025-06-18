import java.util.Arrays;

public class leet2966 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length / 3][3];

        for (int i = 0; i < nums.length; i+=3) {
            result[i / 3][0] = nums[i];
            result[i / 3][1] = nums[i + 1];
            result[i / 3][2] = nums[i + 2];
            if (nums[i] + k < nums[i + 2]) {
                return new int[0][0];
            }
        }

        return result;
    }
}
