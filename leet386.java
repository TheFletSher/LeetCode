import java.util.ArrayList;
import java.util.List;

public class leet386 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = (ArrayList<Integer>) lexicalOrder(100);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i) + " ");
        }
    }

    public static List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> nums = new ArrayList<>(n);

        // 1-9
        for (int start = 1; start < 10; start++) {
            lexicalHelper(nums, 0, n, start);
        }

        return nums;
    }

    public static void lexicalHelper(ArrayList<Integer> nums, int exp, int n, int start) {
        int size = (int) Math.pow(10, exp);

        // Loop through adding base 10s (1, 10, 100, 1000)
        if (size < n) {
            nums.add(start * size);
            lexicalHelper(nums, ++exp, n, start);
        }

        for (int i = 1; i < 10; i++) {

        }

    }
}
