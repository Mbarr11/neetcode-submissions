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

class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int numOfNodes = 0;
        ListNode currentNode = head;

        while(currentNode != null){
            numOfNodes++;
            currentNode = currentNode.next;

        }

        int nodeIndexToRemove = numOfNodes - n;
        if(nodeIndexToRemove == 0){
            return head.next;
        }

        currentNode = head;
        for(int i = 0 ; i < numOfNodes; i++){
            // find previous node and point it to next.next
            // skips over node to delete
            if(i == nodeIndexToRemove - 1){
                currentNode.next = currentNode.next.next;
                break;
            }
            currentNode = currentNode.next;
        }
        return head;
    }
}
