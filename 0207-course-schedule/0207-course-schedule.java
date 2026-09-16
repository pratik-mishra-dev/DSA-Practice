class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
         int[] arr=new int[n];
        int m=prerequisites.length;

        List<List<Integer>> l=new ArrayList<>();

        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            int a=prerequisites[i][0];
            int b=prerequisites[i][1];

            l.get(b).add(a);

            arr[a]++;
        }

        Queue<Integer> q=new ArrayDeque<>();
        int[] ans=new int[n];
        int k=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                ans[k++]=i;
                q.add(i);
            }
        }

        while(q.size()>0){
            int x=q.remove();

            for(int ele:l.get(x)){
                 arr[ele]--;
                if(arr[ele]==0){
                ans[k++]=ele;
                q.add(ele);
                 }
                }

        }
        if(k!=n) return false;
        return true;
    }
}