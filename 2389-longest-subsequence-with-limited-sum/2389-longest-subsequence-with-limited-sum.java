class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=queries.length;
        int[] arr=new int[n];
        Arrays.sort(nums);
        int m=nums.length;
        for(int i=0;i<n;i++){
            int count=0;
            int j=0;
            while(j<m && count+nums[j]<=queries[i]){
                count+=nums[j];
                j++;
            }
            arr[i]=j;
        }
        return arr;
    }
}