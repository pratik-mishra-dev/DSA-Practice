class Solution {
    public int find(int i,int j,int find,int[] arr){
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==find) return mid+1;
            else if(arr[mid]>find) j=mid-1;
            else i=mid+1;
        }
        return i;
    }
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=queries.length;
        int m=nums.length;
        int[] arr=new int[n];
        Arrays.sort(nums);
        for(int i=1;i<m;i++)
        nums[i]+=nums[i-1];

        
        for(int i=0;i<n;i++){
            int find=queries[i];
            int ind=find(0,m-1,find,nums);
            arr[i]=ind;
        }
        return arr;
    }
}