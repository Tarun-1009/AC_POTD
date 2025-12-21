package day_10;

public class AddString {
    public String addStrings(String num1, String num2) {
       StringBuilder sum=new StringBuilder();
       int i=num1.length()-1;
       int j=num2.length()-1;
       int carry=0;
       while(i>=0||j>=0||carry>0){
        int n1=(i>=0)?num1.charAt(i)-'0':0;
        int n2=(j>=0)?num2.charAt(j)-'0':0;
        int s=n1+n2+carry;
        carry=s/10;
        sum.append(s%10);
        i--;
        j--;
       }
       return sum.reverse().toString();
    }
}
