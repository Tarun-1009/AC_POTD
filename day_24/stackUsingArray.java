package day_24;

public class stackUsingArray {
    private int[] stack;
    private int i=-1;
    private int size;

    public void myStack(int n) {
        size=n;
        stack=new int[n];
    }

    public boolean isEmpty() {
        if(i==-1){
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if(i==stack.length-1){
           return true; 
        }
        return false;
    }

    public void push(int x) {
        if(!isFull()){
             i++;
            stack[i]=x;
        }
    }

    public void pop() {
        if(!isEmpty()){
            i--;
        }
        
    }

    public int peek() {
         if(isEmpty()){
            return -1;
        }
        else
        return stack[i];
    }
}
    