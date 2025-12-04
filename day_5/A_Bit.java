package day_5;
import java.util.Scanner;
public class A_Bit {
    public static void main(String[] args) {
        int x=0;
        int n;
        String s;
        Scanner in =new Scanner(System.in);
        n=in.nextInt();

        for(int i=1;i<=n;i++){
            s=in.next();
            if(s.equals("++X") || s.equals("X++")){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
    }
}