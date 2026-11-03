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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans=new ListNode(-1);
        ListNode dommy=ans;

        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=val){
               
                dommy.next=temp;
                dommy=temp;
            }
            temp=temp.next;
        }
        dommy.next=null;
        return ans.next;
    }
}