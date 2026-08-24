class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int x=arr[i+1]-arr[i];
            min=Math.min(min,x);
        }
        List<List<Integer>> brr=new ArrayList<>();
        for(int i=0;i<n-1;i++){
            int x=arr[i+1]-arr[i];
            if(x==min){
                List<Integer> list=new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                brr.add(list);
            }
        }
        return brr;
    }
}