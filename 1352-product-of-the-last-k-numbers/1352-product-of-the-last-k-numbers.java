class ProductOfNumbers {
     List<Integer> pro=new ArrayList<>();

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        if(num==0){
            pro.clear();
        }
        else if(pro.size()==0) pro.add(num);
        else{
            pro.add(pro.get(pro.size()-1)*num);
        }
    }
    
    public int getProduct(int k) {
        int size=pro.size();
        if(size<k) return 0;
        if (size == k) return pro.get(size - 1);
        else {
            int p = pro.get(size-1) / pro.get(size-1-k);
            return p;
        }
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */