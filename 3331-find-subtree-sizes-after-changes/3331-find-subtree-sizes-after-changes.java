class Solution {
     List<List<Integer>> adj;
    int[] result;
    int[] last;

    public void dfs(int current,String s,int[] parent){
        int c=s.charAt(current)-'a';

        int nearpar=last[c];

        last[c]=current;
        for(int ele:adj.get(current)){
            dfs(ele,s,parent);
        }


        last[c]=nearpar;

        if(current!=0){
            int newparent=parent[current];
            if(nearpar!=-1){
               newparent=nearpar;
               
            }
            parent[current]=newparent;
             result[newparent]+=result[current];
        }
    }

    public int[] findSubtreeSizes(int[] parent, String s) {
        int n=parent.length;

        adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=1;i<n;i++){
            int u=parent[i];
            int v=i;

            adj.get(u).add(v);
        }

        result=new int[n];
        Arrays.fill(result,1);

        last=new int[26];
        Arrays.fill(last,-1);

        dfs(0,s,parent);

        return result;

    }
}