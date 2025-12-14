package day_12;

public class Longest_common_prefix {
    
    public String longestCommonPrefix(String[] strs) {
        int n=strs[0].length();
        int count;
        String str="";
        for(int i=1;i<strs.length;i++){
            if(n>strs[i].length()){
                n=strs[i].length();
            }
        }
        for(int i =0;i<n;i++){
            char c=strs[0].charAt(i);
            count =0;
            for(int j=1;j<strs.length;j++){
                if( c == strs[j].charAt(i)){
                  count++;
                }
            }
            if(count == strs.length-1){
                str=str+c;
            }
            else{
                return str;
            }
        }
        return str;
       
    }
}
