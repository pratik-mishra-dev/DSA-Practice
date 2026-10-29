class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;

        List<String> l=new ArrayList<>();
        if(n==0) return l;
        int c=nums[0];
        int i=1;
        for( i=1;i<n;i++){
            if(nums[i]==nums[i-1]+1) continue;
            else{
                if(nums[i-1]==c){
                    String s=""+c;
                    l.add(s);
                }
                else{
                     String s=c+"->"+nums[i-1];
                     l.add(s);
                }

                 c=nums[i];
            }

           
        }

        if(nums[i-1]==c){
                    String s=""+c;
                    l.add(s);
                }
                else{
                     String s=c+"->"+nums[i-1];
                     l.add(s);
                }
        return l;
    }
}