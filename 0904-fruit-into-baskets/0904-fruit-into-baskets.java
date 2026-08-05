class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int i=0,j=0;
        int max_length=0,length=0;
        Map<Integer,Integer>map=new HashMap<>();
        while(j<n){
            int x=fruits[j];
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);

            while(map.size()>2){
                int freq=map.get(fruits[i]);
                if(freq==1) map.remove(fruits[i]);
                else map.put(fruits[i],map.get(fruits[i])-1);
                i++;
            }
            length=j-i+1;
            max_length=Math.max(max_length,length);
            j++;
        }
        return max_length;
    }
}