class Solution {
    public class pair implements Comparable<pair>{
        int key;
        int val;
        pair(int key,int val){
            this.key=key;
            this.val=val;
        }
        public int compareTo(pair p){
            return this.val-p.val;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        PriorityQueue<pair>pq=new PriorityQueue<>();
        for(int ele:nums){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        for(int key:map.keySet()){
            int x=key;
            int val=map.get(key);
            pq.add(new pair(x,val));
            if(pq.size()>k) pq.poll();
        }
        int[] ans=new int[k];
        int i=0;
        while(pq.size()>0){
            pair temp=pq.poll();
            ans[i++]=temp.key;
        }
        return ans;
    }
}