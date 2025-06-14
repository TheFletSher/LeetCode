public class leet2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9)));

        int num1 = 0, exp = 0;
        ListNode curr = l1;
        while (curr != null) {
            num1 += curr.val * Math.pow(10, exp++);
            curr = curr.next;
        }

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println();

        curr = result;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1 = 0, num2 = 0, exp = 0;

        ListNode curr = l1;
        while (curr != null) {
            num1 += curr.val * Math.pow(10, exp++);
            curr = curr.next;
        }

        System.out.println(num1);

        exp = 0;
        curr = l2;
        while (curr != null) {
            num2 += curr.val * Math.pow(10, exp++);
            curr = curr.next;
        }

        System.out.println(num2);

        exp = 0;
        int total = num1 + num2;

        System.out.println(total);

        ListNode result = new ListNode(total % 10);
        total /= 10;
        curr = result;
        while (total > 0) {
            int val = total % 10;
            curr.next = new ListNode(val);
            System.out.println(total % 10);
            total /= 10;
            System.out.println(total);
            curr = result.next;
        }

        return result;
    }
}
