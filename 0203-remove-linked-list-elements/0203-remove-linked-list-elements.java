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
                ListNode a=new ListNode(temp.val);
                dommy.next=a;
                dommy=a;
            }
            temp=temp.next;
        }
        return ans.next;
    }
}