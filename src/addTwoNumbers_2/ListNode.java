package addTwoNumbers_2;

import java.util.ArrayList;

public class ListNode {
    int val;
    ListNode next;

    // Constructors
    public ListNode(){}

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null) return l2;  // Handle null lists
        if (l2 == null) return l1;

        // Reverse the input nodes
        l1 = reverseList(l1);
        l2 = reverseList(l2);


        // Convert lists to numbers
        int n1 = listToNum(l1);
        int n2 = listToNum(l2);

        // Sum the two numbers
        int sum = n1 + n2;

        // Reverse Back the int
        int sumReversed = reverseInteger(sum);

        // Convert the sum back to a reversed ListNode
        return numberToList(sum);
    }

    // Reverses a linked list
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;        // Initialize prev to null
        ListNode current = head;     // Start with the head of the list

        while (current != null) {
            ListNode nextNode = current.next; // Next node tmp stored
            current.next = prev;              // Reverse the current node's next pointer
            prev = current;                   // Move prev to current
            current = nextNode;               // Move current to next node
        }

        return prev;  // At the end, prev will be the new head of the reversed list
    }

    // Converts a ListNode to an integer
    public static int listToNum(ListNode head) {
        int num =0;
        while(head != null){
            num = num * 10 + head.val; // num*10 moves along unit[0]; e.g., 34 -> 340 + 2 = 342
            head = head.next;
        }
        return num;
    }

    public static ArrayList<Integer> listToArray(ListNode head) {

        ArrayList<Integer> result = new ArrayList<>();

        int num =0;
        while(head != null){

            result.add(head.val);
            head = head.next;
        }
        return result;
    }

    // Converts an integer to a ListNode
    public static ListNode numberToList(int num) {

        // if 0 make node 0
        if (num == 0){
            return new ListNode(0);
        }

        ListNode dummy = new ListNode(0); // Dummy node
        ListNode current = dummy;         // Current node starts at dummy

        while (num > 0) {
            int digit = num % 10;         // Extract last digit
            current.next = new ListNode(digit); // Create new node with the digit
            current = current.next;       // Move current to the next node
            num = num / 10;               // Remove the last digit from the number
        }
        return dummy.next;
    }

    public static int reverseInteger(int num) {
        int reversed = 0;

        // Loop until all digits are processed
        while (num != 0) {
            int lastDigit = num % 10;         // Extract the last digit
            reversed = reversed * 10 + lastDigit;  // Append the last digit to the reversed number
            num = num / 10;                   // Remove the last digit from the original number
        }

        return reversed;
    }

    // Helper function to print a list (for debugging purposes)
    public static void printList(ListNode head) {

        while(head != null){
            System.out.print(head.val);

            if(head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }
        System.out.println();


    }
}
