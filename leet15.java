import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class leet15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> pairs = threeSum(nums);

        
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<Integer> pos = new HashSet<>(), neg = new HashSet<>();

        boolean zero = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                pos.add(nums[i]);
            } else if (nums[i] > 0) {
                neg.add(nums[i]);
            } else {
                zero = true;
            }
        }

        List<List<Integer>> pairs = new ArrayList<>();

        return pairs;
    }
}
