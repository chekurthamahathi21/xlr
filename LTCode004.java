/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// Definition for singly-linked list.

public class LTCode004{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // Dummy head for the result list
        ListNode current = dummyHead; // Pointer to build the new list
        int carry = 0; // Variable to store carry

        // Loop until both lists are exhausted and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry; // Start with the carry

            // Add the value from l1 if it's not null
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // Move to the next node in l1
            }

            // Add the value from l2 if it's not null
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // Move to the next node in l2
            }

            // Update carry for the next iteration
            carry = sum / 10;
            // Create a new node with the digit value (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next; // Move to the next node in the result list
        }

        return dummyHead.next; // Return the next node of dummy head, which is the actual result
    }
}