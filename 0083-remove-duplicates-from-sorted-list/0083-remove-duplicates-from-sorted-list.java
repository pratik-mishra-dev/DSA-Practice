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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode curr=head;

        while(curr!=null){
            if(curr.val==temp.val) curr=curr.next;
            else{
                 
                temp.next=curr;
                temp=temp.next;
                curr=curr.next;
               
            }
        }
        temp.next=null;
        return head;
    }
}