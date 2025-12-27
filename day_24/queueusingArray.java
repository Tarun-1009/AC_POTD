package day_24;

public class queueusingArray {
    private int[] queue;
    private int size;
    private int f=-1;
    private int r=-1;

    public void myQueue(int n) {
        queue=new int[n];
        size=n;
    }

    public boolean isEmpty() {
        if(f==-1){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(r==size-1){
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        if(!isFull()){
        if(f==-1&&r==-1){
            f++;
            r++;
        }
        else{
            r++;
        }
        queue[r]=x;
        }
    }

    public void dequeue() {
        if(!isEmpty()){
            for(int i=1;i<=r;i++){
                queue[i-1]=queue[i];
            }
            if(f==r){
                f=-1;
                r=-1;
            }
            else
            r--;
        }
    }

    public int getFront() {
        if(!isEmpty()){
            return queue[f];
        }
        return -1;
    }

    public int getRear() {
        if(!isEmpty()){
            return  queue[r];
        }
        return -1;
    }
}

