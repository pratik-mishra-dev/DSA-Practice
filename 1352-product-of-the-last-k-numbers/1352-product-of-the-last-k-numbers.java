class ProductOfNumbers {
    List<Integer> l=new ArrayList<>();;
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        l.add(num);
    }
    
    public int getProduct(int k) {
        int product=1;
        int size=l.size();
        for(int i=0;i<k;i++){
            product*=l.get(size-1);
            size--;
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */