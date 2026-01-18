public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /**
         * simple airthematic operation is done between individual nodes of the two
         * linked lists:
         * dummy node acts as a placeholder and it will be used to return the head of
         * the list
         */
        /**
         * initializing variables
         */
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        /**
         * Since we are allowed to store only one digit as a value in each node, the
         * maxiumum value which can be calculated is 19(9+9+1[from previous carry]).
         * This means that the carry can have a value of either zero or one.
         */
        int carry = 0;
        /**
         * iterate through until their are elements in either of the list or carry has a
         * value
         */
        while (l1 != null || l2 != null || carry != 0) {
            /**
             * get a value of there is a node in the list
             */
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y;
            /**
             * find the carry value
             */
            carry = sum / 10;
            /**
             * This ensures that only a single digit is stored in the value element
             */
            ans.next = new ListNode(sum % 10);
            /**
             * move pointers further
             */
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummy.next;

    }

}
