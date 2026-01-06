package day_28;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
        Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        int n=q.size();
        Queue<Integer> q1 = new LinkedList<>();
        int i=n;
        while(i-->0){
            q1.add(q.peek());
            q.poll();
        }
        q.add(x);
        i=n;
        while(i-->0){
            q.add(q1.peek());
            q1.poll();
        }
    }

    void pop() {
        if(q.size()>0)
        q.poll();
    }

    int top() {
        if(q.size()>0){
            return q.peek();
        }
        else
        return -1;
    }

    int size() {
       return q.size();
    }
}
