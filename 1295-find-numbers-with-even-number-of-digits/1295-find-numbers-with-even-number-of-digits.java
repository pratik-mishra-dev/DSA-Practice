class Solution {
    public boolean check(int n){
       int a=0;
       while(n>0){
        a++;
        n/=10;
       }
        if(a%2==0) return true;
        return false;
    }
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(check(nums[i])) count++;
        }
        return count;
    }
}