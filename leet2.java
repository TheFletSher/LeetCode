import java.util.ArrayList;

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

        ListNode result = addTwoNumbers(l3, l1);

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
        ArrayList<Integer> num1 = new ArrayList<>(), num2 = new ArrayList<>();

        ListNode curr = l1;
        while (curr != null) {
            num1.add(curr.val);
            curr = curr.next;
        }

        curr = l2;
        while (curr != null) {
            num2.add(curr.val);
            curr = curr.next;
        }

        int size = Math.min(num1.size(), num2.size());
        

        boolean carry = false;
        int toAdd = num1.get(0) + num2.get(0);
        if (toAdd > 9) {
            toAdd %= 10;
            carry = true;
        }
        ListNode result = new ListNode(toAdd);
        curr = result;
        for (int i = 1; i < size || carry; i++) {
            toAdd = num1.get(i) + num2.get(i);
            if (carry) {
                toAdd += 1;
                carry = false;
            }
            if (toAdd > 9) {
                toAdd %= 10;
                carry = true;
            }
            curr.next = new ListNode(toAdd);
        }

        return result;
    }
}
