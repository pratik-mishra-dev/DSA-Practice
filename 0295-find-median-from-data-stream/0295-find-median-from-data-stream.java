class MedianFinder {
    PriorityQueue<Integer>maxheep=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer>minheep=new PriorityQueue<>();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        if(maxheep.size()==0) maxheep.add(num);
        else{
            if(num < maxheep.peek()) maxheep.add(num);
            else minheep.add(num);
        }

        if(maxheep.size()==minheep.size()+2) minheep.add(maxheep.poll()); 
        if(minheep.size()==maxheep.size()+2) maxheep.add(minheep.poll()); 
    }
    
    public double findMedian() {
        if(maxheep.size()>minheep.size()) return maxheep.peek();
        else if(minheep.size()>maxheep.size()) return minheep.peek();
        else{
            return (minheep.peek()+maxheep.peek())/2.0;
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */