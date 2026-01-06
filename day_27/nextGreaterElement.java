package day_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextGreaterElement {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> ans =new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while( stack.size()>0 && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}
