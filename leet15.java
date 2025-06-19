import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leet15 {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> pairs = threeSum(nums);

        
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> pos = new HashMap<>(), neg = new HashMap<>();

        int zero = 0;

        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                pos.put(nums[i], pos.getOrDefault(nums[i], 0) + 1);
            } else if (nums[i] < 0) {
                neg.put(nums[i], pos.getOrDefault(nums[i], 0) + 1);
            } else {
                zero++;
            }
        }
        
        if (zero >= 3) pairs.add(new ArrayList<>(List.of(0, 0, 0)));
        if (pos.isEmpty() || neg.isEmpty()) return pairs;

        for (int num : neg.values()) {
            if (pos.containsKey(-num) && zero != 0) {
                pairs.add(new ArrayList<>(List.of(num, 0, -num)));
            } else {
                num = -num;
                for (int i = 1; i < num / 2; i++) {
                    if (pos.containsKey(i) && pos.containsKey(num - i)) {
                        pairs.add(new ArrayList<>(List.of(num, i, num - i)));
                        System.out.println(num + ", " + i + ", " + (num - i));
                    }
                }
            }
        }


        return pairs;
    }
}
