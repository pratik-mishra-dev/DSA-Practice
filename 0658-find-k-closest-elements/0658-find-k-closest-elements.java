class Solution {
   class pair implements Comparable<pair>{
        int ele;
        int dif;
        pair(int ele,int dif){
            this.ele=ele;
            this.dif=dif;
        }
        public int compareTo(pair p){
            if(this.dif==p.dif) return this.ele-p.ele;
            return this.dif-p.dif;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            int diff=Math.abs(x-ele);
            pq.add(new pair(ele,diff));
            if(pq.size()>k) pq.poll();
        }
         List<Integer>l=new ArrayList<>();
         while(pq.size()>0){
            pair temp=pq.remove();
            l.add(temp.ele);
         }
         Collections.sort(l);
         return l;
    }
}