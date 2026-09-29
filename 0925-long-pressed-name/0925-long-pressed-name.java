class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n1=name.length();
        int n2=typed.length();
        
        int i=0,j=0;
        while(j<n2){
             if (i < n1 && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } 
            else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } 
            else {
                return false;
            }
        }
        return i==n1;
    }
}