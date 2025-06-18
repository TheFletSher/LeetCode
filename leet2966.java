import java.util.Arrays;

public class leet2966 {
    public int[][] divideArray(int[] nums, int k) {
        int[][] result = new int[nums.length / 3][3];

        for (int i = 0; i < nums.length; i++) {
            int current = i / 3;
            result[current][i % 3] = nums[i];
            if (i % 3 == 0 && nums[i] + k < nums[i + 2]) {
                return new int[0][0];
            }
        }

        return result;
    }
}
