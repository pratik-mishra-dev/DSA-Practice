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
        //List<Integer> l=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        ListNode temp=head;
        ListNode temp_speed=head.next;

        while(temp_speed.next!=null){
            st.push(temp.val);
            temp=temp.next;
            temp_speed=temp_speed.next.next;
        }
        
        st.push(temp.val);
        temp=temp.next;

       while(temp!=null){
           int x=st.pop()+temp.val;
           if(x>ans) ans=x;
            temp=temp.next;
        }

        return ans;
    }
}