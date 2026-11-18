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
    public int pairSum(ListNode head) {

        //List<Integer> l=new ArrayList<>();
       // Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        ListNode temp_speed=head.next;

        while(temp_speed.next!=null){
            temp=temp.next;
            temp_speed=temp_speed.next.next;
        }
          temp=temp.next;

       ListNode next=null;
      // ListNode curr=null;
       ListNode prev=null;
      
       
       while(temp!=null){
            next=temp.next;
           temp.next=prev;
           prev=temp;
           temp=next;
        }
        int ans=0;
          temp=head;
         while(prev!=null){
            int x=temp.val+prev.val;
            if(x>ans) ans=x;

            temp=temp.next;
            prev=prev.next;
         }

        return ans;
    }
}