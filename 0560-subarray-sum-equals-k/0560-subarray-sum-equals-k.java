class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(nums[0],1);
        if(nums[0]==k) count++;

        for(int i=1;i<n;i++){
           nums[i]=nums[i]+nums[i-1];

           if(nums[i]==k) count++;

           if(map.containsKey(nums[i]-k)){
                count=count+map.get(nums[i]-k);
           }

           if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
           }
           else map.put(nums[i],1);
        }
        return count;
    }
}