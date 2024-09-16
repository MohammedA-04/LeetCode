package addTwoNumbers_2;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        // {2,4,3}
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);

        // New List {5,6,4}
        node4.next = node5;
        node5.next = node6;

        // Node 1 and 4 are our LISTS
        ListNode.printList(node1);
        ListNode.printList(node4);

        // Printing Reversed List :)
        System.out.println("\nReversed List:");
        ///ListNode.printList(ListNode.reverseList(node1));
        ///ListNode.printList(ListNode.reverseList(node4));

        // Converting list to number
        ///System.out.println("\n\nConverting to number");
        ///ListNode test1 = ListNode.reverseList(node1);
        ///int testN1 = ListNode.listToNum(test1);

        ///ListNode.printList(test1);
        ///System.out.println("List as int: " + testN1);

        // Doing it

        ListNode result = ListNode.addTwoNumbers(node1, node4);
        ArrayList alRes = ListNode.listToArray(result);

        System.out.println("\n\nResult:");
        System.out.println("Converted to ArrList: " + alRes);
        // 243, 564 -> 342 + 465 = 807 -> {7,0,8}






    }
}