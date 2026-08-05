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
    public ListNode mergeKLists(ListNode[] lists) {
         int n=lists.length;
         PriorityQueue<Integer>pq=new PriorityQueue<>();
         for(int i=0;i<n;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                pq.add(temp.val);
                temp=temp.next;
            }
         }
         if(pq.size()==0) return null;
         ListNode ans=new ListNode(pq.poll());
         ListNode temp=ans;
         while(pq.size()>0){
            ListNode curr=new ListNode(pq.poll());
            temp.next=curr;
            temp=temp.next;
         }
         
         return ans;
    }
}