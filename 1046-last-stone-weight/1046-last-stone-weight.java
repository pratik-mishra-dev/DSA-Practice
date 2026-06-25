class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();
             x=x-y;
            if(x!=0) pq.add(x);
        }
        if(pq.size()==1) return pq.poll();
        return 0;
    }
}