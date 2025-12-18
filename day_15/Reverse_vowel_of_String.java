package day_15;

import java.util.Stack;

public class Reverse_vowel_of_String {
    public String reverseVowels(String s) {
        String reverse=new String();
        reverse="";
        Stack<Character> vowel = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                vowel.push(c);
            }
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                reverse+=vowel.peek();
                vowel.pop();
            }
            else
            reverse+=c;
        }
        return reverse;
    }
    public static boolean isVowel(char c) {
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
        return true;
    } else {
        return false;
    }
}   
}
