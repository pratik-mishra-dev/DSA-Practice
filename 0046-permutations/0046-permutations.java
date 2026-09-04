class Solution {
    public void check(int[] nums,List<Integer> l,List<List<Integer>> ans,boolean[] isvalid){
        if(nums.length==l.size()){
            List<Integer> temp=new ArrayList<>();

            for(int i=0;i<l.size();i++)
                temp.add(l.get(i));

            ans.add(temp);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(isvalid[i]==false){
                isvalid[i]=true;
                l.add(nums[i]);
                check(nums,l,ans,isvalid);
                l.remove(l.size()-1);
                isvalid[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        boolean[] isvalid=new boolean[nums.length];
        check(nums,l,ans,isvalid);
        return ans;
    }
}