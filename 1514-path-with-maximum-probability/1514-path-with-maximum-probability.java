class Solution {
    public class pair implements Comparable<pair>{
        int ind;
        double prob;

         pair(int ind,double prob){
            this.ind=ind;
            this.prob=prob;
        }

        @Override
        public int compareTo(pair other){
            if( this.prob== other.prob) return this.ind-other.ind;
            return Double.compare( other.prob,this.prob);
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        
        List<List<pair>> l=new ArrayList<>();

        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            int a=edges[i][0]; int b=edges[i][1]; double p=succProb[i];
            l.get(a).add(new pair(b, p));
             l.get(b).add(new pair(a, p));
        }
        double[] result=new double[n+1];
        Arrays.fill(result,Integer.MIN_VALUE);
        result[start]=1;

        PriorityQueue<pair> pq=new PriorityQueue<>();
        pq.add(new pair(start,1));

        while(pq.size()>0){
            pair temp=pq.remove();

            int ind=temp.ind;
            double prob=temp.prob;

            if(result[ind]>prob) continue;

            for(pair p:l.get(ind)){
                double p_curr=prob*p.prob;
                if(result[p.ind]< p_curr){
                    result[p.ind]=p_curr;
                    pq.add(new pair(p.ind, p_curr));
                }
            }
        }
        if(result[end]==Integer.MIN_VALUE) return 0;
        return result[end];
    }
}