class Solution {
    public boolean uniformArray(int[] nums) {
        int n=nums.length;
        int count=0;
        int min=Integer.MAX_VALUE;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                count++;
                min=Math.min(min,nums[i]);
            }
            else{
                l.add(i);
            }

        }
        if(count==0 || count==n) return true;
        for(int ele:l){
            int x=nums[ele];
            if(x<=min) return false;
        }
        return true;
    }
}