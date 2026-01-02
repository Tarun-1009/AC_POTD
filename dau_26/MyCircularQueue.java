class MyCircularQueue {
    static int[] queue ;
    int size;
    int f=-1,r=-1;

    public MyCircularQueue(int k) {
        queue =new int[k];
        size=k;
    }
    
    public boolean enQueue(int value) {
        if(f ==-1 && r==-1){
            f++;
            r++;
            queue[r]=value;
            return true;
        }
        else if(!isFull()){
            r= (r==size-1)? 0:r+1;
            queue[r]=value;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
          if(f==r){
            f=-1;
            r=-1;
            return true;
        }
            f=(f==size-1)?0:f+1;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(f>-1){
            return queue[f];
        }
        return -1;
    }
    
    public int Rear() {
        if(r>-1){
            return queue[r];
        }
        return -1;
    }
    
    public boolean isEmpty() {
        if(f ==-1 &&r==-1){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if (f==r+1 || (f==0 && r==size-1)){
            return true;
        }
        return false;

       }
}
