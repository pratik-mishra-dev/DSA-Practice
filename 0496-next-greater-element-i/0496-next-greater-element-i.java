class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int j=0;
            while(j<m){
                if(nums2[j]==nums1[i]) break;
                j++;
            }
            int x=-1;
            j++;
            while(j<m){
                if(nums2[j]>nums1[i]){
                    x=nums2[j];
                    break;
                }
                j++;
            }
            arr[i]=x;
        }
        return arr;
    }
}