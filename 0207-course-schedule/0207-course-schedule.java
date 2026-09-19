class Solution {
    boolean ans=true;
    public void dfs(int i, boolean[] visit, boolean[] path, List<List<Integer>> l){
       visit[i]=true;
        path[i]=true;
        for(int ele:l.get(i)){
            if(path[ele]){
                ans=false;
                return;
            }
             if (!visit[ele]) {
                dfs(ele, visit, path, l);
                if (!ans) return;
            }
              
        }
        path[i]=false;

    }
    public boolean canFinish(int n, int[][] prerequisites) {
        int m=prerequisites.length;

        List<List<Integer>> l=new ArrayList<>();

        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];

            l.get(b).add(a);
        }

        boolean[] visit=new boolean[n];
        boolean[] path=new boolean[n];

        for(int i=0;i<n;i++){
            if(visit[i]==false) dfs(i,visit,path,l);
        }

        return ans;

    }
}