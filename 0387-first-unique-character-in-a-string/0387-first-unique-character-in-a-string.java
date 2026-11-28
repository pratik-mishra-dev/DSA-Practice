class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
         HashSet<Character> set=new HashSet<>();


        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map.containsKey(c)){
                map.remove(c);
            }
            else if(!set.contains(c)){
                map.put(c,i);
                set.add(c);
            }
        }
        int ind=Integer.MAX_VALUE;
        for(Character ele:map.keySet()){
            int x=map.get(ele);
            if(x<ind) ind=x;
        }
        return ind==Integer.MAX_VALUE?-1:ind;
    }
}