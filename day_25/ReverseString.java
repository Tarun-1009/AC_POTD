package day_25;

import java.util.Stack;

public class ReverseString {
    public String reverse(String S) {
        Stack<Character> stack=new Stack<>();
        String str="";
        for( char c :S.toCharArray()){
            stack.push(c);
        }
        for(int i=0;i<S.length();i++){
            str+=stack.pop();
        }
        return str;
    }
}
