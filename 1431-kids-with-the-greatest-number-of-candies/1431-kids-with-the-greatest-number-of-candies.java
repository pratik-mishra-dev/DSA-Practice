class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=Integer.MIN_VALUE;
        for(int ele:candies){
             if(max<ele) max=ele;
        }
         List<Boolean>l=new ArrayList<>();
         for(int ele:candies){
             if((ele+extraCandies)>=max) l.add(true);
             else l.add(false);
        }
       return l;
    }
}