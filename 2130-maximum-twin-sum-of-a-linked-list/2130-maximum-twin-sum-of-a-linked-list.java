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
        int ans=0;
        List<Integer> l=new ArrayList<>();

        ListNode temp=head;
        ListNode temp_speed=head.next;

        while(temp_speed.next!=null){
            l.add(temp.val);
            temp=temp.next;
            temp_speed=temp_speed.next.next;
        }
        
        l.add(temp.val);
        temp=temp.next;

       int i=l.size()-1;
       while(temp!=null){
           int x=l.get(i)+temp.val;
           if(x>ans) ans=x;
           i--;
            temp=temp.next;
        }

        return ans;
    }
}