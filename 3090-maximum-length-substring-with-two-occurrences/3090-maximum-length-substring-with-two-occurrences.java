class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<n){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2){
                char left=s.charAt(i);
                map.put(left,map.get(left)-1);
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        return max;
    }
}