class Solution {
    public int helper(int a,int[] arr,int i,int j){
        while(i<=j){
            int mid=i+(j-i)/2;

            if(a==arr[mid]) return mid;
            else if(arr[mid]>a) j=mid-1;
            else i=mid+1;
        }
        return i;
    }
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n=arr1.length;
        int m=arr2.length;

        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<n;i++){
            int ind=helper(arr1[i],arr2,0,m-1);
           if(ind==0){
            if(Math.abs(arr1[i]-arr2[ind]) > d) count++;
           }
           else if(ind==m) {
            if(Math.abs(arr1[i]-arr2[ind-1]) > d) count++;
           }
           else{
            if(Math.abs(arr1[i]-arr2[ind]) > d && Math.abs(arr1[i]-arr2[ind-1]) > d) count++;
           }
        }
        return count;
    }
}