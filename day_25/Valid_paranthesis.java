package day_25;

import java.util.Stack;

public class Valid_paranthesis {
    public boolean isValid(String s) {
        int cont =0;
        Stack<Character> stack=new Stack<>();
        char c;
        for(int i=0;i<s.length();i++){
          c=s.charAt(i);
          if(c == '(' || c=='{' || c=='[' ){
            stack.push(c);
          } 
          else  {
            if(stack.isEmpty()){
                return false;
            }
            if(c==pair(stack.peek())) {
                stack.pop();
            }
            else
            return false;
          }
        }
        if(!stack.isEmpty())
        return false;
        return true;
    }
    public char pair(char c){
        if(c == '{' ){
            return '}';
        }
        else if( c == '('){
            return ')';
        }
        else
        return ']';
    }
}
