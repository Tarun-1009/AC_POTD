package day_16;

public class Reverse_words_of_string {
    public String reverseWords(String s) {
        String str="";
        String word="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                word=word+s.charAt(i);
            }
            else{
                    if(str.length()!=0 && word.length()!=0)
                    str=word+" "+str;
                    else
                    str=word+str;
                word="";
            }
        }
        if(word.length()!=0 ){
            if(str.length()!=0)
        str=word +" "+ str;
        else
        str=word+str;
        }
        
        return str;
    }
}
