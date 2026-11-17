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
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        int i=0,j=l.size()-1;
        while(i<j){
            int x=l.get(i)+l.get(j);
            if(x>ans) ans=x;
            i++;
            j--;
        }
        return ans;
    }
}