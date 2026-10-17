class Solution {
    class Pair implements Comparable<Pair>{
        int ind;
        int end;
        Pair(int ind, int end) {
        this.ind = ind;
        this.end = end;
    }
        
            @Override
        public int compareTo(Pair a) {
        if (this.end != a.end) {
            return Integer.compare(this.end, a.end);
        }

        return Integer.compare(this.ind, a.ind);
    }
    }

    public boolean carPooling(int[][] trips, int capacity) {
        int n=trips.length;

        int current=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int i=0;i<n;i++){

            int s=trips[i][1];
            int e=trips[i][2];
            int req=trips[i][0];

            while(pq.size()>0 && pq.peek().end<=s){
                Pair p=pq.remove();
                int ind=p.ind;
                current-=trips[ind][0];
            }

            current+=req;
            if(current>capacity) return false;

            
            pq.add(new Pair(i,e));


        }
        return true;
    }
}