public class leet2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0, num2 = 0, exp = 0;
        for (int num : l1) {
            num1 += num * Math.pow(10, exp++);
        }

        exp = 0;
        for (int num : l2) {
            num2 += num * Math.pow(10, exp++);
        }

        int[] result = new int[exp];

        exp = 0;
        int total = num1 + num2;
        while (total > 0) {
            result[exp++] = total % 10;
            total /= 10;
        }

        return result;
    }
}
