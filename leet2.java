public class leet2 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0, num2 = 0, exp = 0;

        ListNode curr = l1;
        while (l1.next != null) {
            num1 += l1.val * Math.pow(10, exp++);
            curr = l1.next;
        }

        exp = 0;
        curr = l2;
        while (l2.next != null) {
            num2 += l2.val * Math.pow(10, exp++);
            curr = l2.next;
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
