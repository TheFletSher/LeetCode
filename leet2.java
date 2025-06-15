import java.util.ArrayList;
import java.util.LinkedList;

public class leet2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode l3 = new ListNode(9);

        int num1 = 0, exp = 0;
        ListNode curr = l1;
        while (curr != null) {
            num1 += curr.val * Math.pow(10, exp++);
            curr = curr.next;
        }

        ListNode result = addTwoNumbers(l2, l3);

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
        int toAdd = l1.val + l2.val;
        l1 = l1.next;
        l2 = l2.next;

        boolean carry = false;
        if (toAdd > 9) {
            toAdd %= 10;
            carry = true;
        }
        
        ListNode result = new ListNode(toAdd);

        ListNode currRes = result;

        while (l1 != null || l2 != null) {
            toAdd = 0;
            if (carry) {
                toAdd = 1;
                carry = false;
            }
            if (l1 == null) {
                toAdd += l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                toAdd += l1.val;
                l1 = l1.next;
            } else {
                toAdd += l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            if (toAdd > 9) {
                toAdd %= 10;
                carry = true;
            }
            currRes.next = new ListNode(toAdd);
            currRes = currRes.next;
        }

        if (carry) {
            currRes.next = new ListNode(1);
        }

        return result;
    }
}
