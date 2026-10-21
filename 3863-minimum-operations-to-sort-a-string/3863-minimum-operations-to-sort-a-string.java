class Solution {
    public int minOperations(String s) {
        int n=s.length();

        

        char[] arr=s.toCharArray();
        Arrays.sort(arr);

        if(s.equals(new String(arr))) return 0;
        if(n==2) return -1;

        if(s.charAt(0)==arr[0] || s.charAt(n-1)==arr[n-1]) return 1;

       for(int i=1;i<n-1;i++){
        if(s.charAt(i)==arr[0]  || s.charAt(i)==arr[n-1]) return 2;
       }

        return 3;
    }
}