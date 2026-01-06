package day_27;

import java.util.ArrayList;
import java.util.Stack;

public class StsckSpanProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<Integer> stack=new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n= arr.length;
        for(int i=0;i<n;i++){
            while(stack.size()>0 && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.size()==0){
                ans.add(i+1);
            }
            else
            ans.add(i-stack.peek());
            stack.push(i);
        }
        return ans;
    }
}
