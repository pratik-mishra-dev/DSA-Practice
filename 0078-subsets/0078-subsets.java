class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        int total=(1<<n);

        for(int i=0;i<total;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<n;j++){
                int mask=(1<<j);
                if((i&mask)!=0) l.add(nums[j]);
            }
            ans.add(l);
        }
        return ans;
    }
}