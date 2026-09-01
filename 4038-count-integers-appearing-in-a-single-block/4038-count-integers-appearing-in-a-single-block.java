class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        int[] arr=new int[101];

        for(int i=0;i<n;i++){
            if(i==0|| nums[i]!=nums[i-1]){
                arr[nums[i]]++;
            }
        }
        int count=0;
        for(int ele:arr){
            if(ele==1) count++;
        }
        return count;
    }
}