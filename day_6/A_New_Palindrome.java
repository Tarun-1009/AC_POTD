package day_6;
import java.util.Scanner;
public class A_New_Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int t = input.nextInt();
    String str;
    for(int i=0;i<t;i++){
      str = input.next();
      int res=0;
      for(int j=1;j<str.length()/2;j++){
      char firstChar = str.charAt(0);
      if(str.charAt(j) != firstChar){
        res=1;
        break;
      }
    }
        if(res==1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
 }
}
}