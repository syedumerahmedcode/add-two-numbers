import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * You are given two non-empty linked lists representing two non-negative
         * integers. The digits are stored in reverse order, and each of their nodes
         * contains a single digit. Add the two numbers and return the sum as a linked
         * list.
         * 
         * You may assume the two numbers do not contain any leading zero, except the
         * number 0 itself.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: l1 = [2,4,3], l2 = [5,6,4]
         * Output: [7,0,8]
         * Explanation: 342 + 465 = 807.
         * 
         * Example 2:
         * 
         * Input: l1 = [0], l2 = [0]
         * Output: [0]
         * 
         */
        System.out.println("Hello, World!");
        ListNode list1 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        list1.next = node12; // 2 -> 4
        node12.next = node13; // 4 -> 3
        System.out.println("The first list is:");
        printReverse(list1);

        ListNode list2 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node33 = new ListNode(4);
        list2.next = node22; // 5 -> 6
        node22.next = node33; // 6 -> 4
        System.out.println("The second list is:");
        printReverse(list2);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(list1, list2);
        System.out.println("The result list is:");
        printReverse(result);

    }

    public static void printReverse(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Pop elements to display in reverse order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
