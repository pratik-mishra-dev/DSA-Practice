class Solution {
    public class pair implements Comparable<pair>{
        int ele;
        int val;
        pair(int ele,int val){
            this.ele=ele;
            this.val=val;
        }
        public int compareTo(pair p){
            if(this.val==p.val) return p.ele-this.ele;
            return this.val-p.val;
        }
    }
    public int[] frequencySort(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else map.put(ele,1);
        }
        PriorityQueue<pair>pq=new PriorityQueue<>();
        for(int key:map.keySet()){
            pq.add(new pair(key,map.get(key)));
        }
        int i=0;
        while(pq.size()>0){
            pair temp=pq.poll();
            int ele=temp.ele;
            int val=temp.val;
            while(val>0){
                nums[i++]=ele;
                val--;
            }
        }
        return nums;

    }
}