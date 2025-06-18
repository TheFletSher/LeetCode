import java.util.Arrays;

public class leet2966 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);

        int[][] result = new int[nums.length / 3][3];

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (index == 3) index = 0;
            int current = i / 3;
            result[current][index++] = nums[i];
            if (i % 3 != 0 && nums[i] + k < nums[i + 1]) {
                return new int[0][0];
            }
        }

        return result;
    }
}
