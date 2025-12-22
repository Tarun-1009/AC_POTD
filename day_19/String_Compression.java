package day_19;

public class String_Compression {
    public String compressedString(String word) {
    StringBuilder str=new StringBuilder("");
    char c=word.charAt(0);
    int count=1;
    for(int i=1;i<word.length();i++){
        if(c!=word.charAt(i) || count == 9){
        
        str.append(count);
        str.append(c);
        c=word.charAt(i);
        count =0;
        }
        count++;
    }
    str.append(count);
    str.append(c);
    return str.toString();
    }
}
