package day_12;
import java.util.Scanner;
public class B_Balanced_Array{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int t,n,e,o;
        t=in.nextInt();
        while(t-->0){
            n=in.nextInt();
            e=0;
            o=0;
            if(n%4!=0){
                System.out.println("NO");
                continue;
            }
            System.out.println("YES");
            for(int i=1;i<=n/2;i++){
                System.out.print(i*2 + " ");
                e=e+i*2;
            }
            for(int i=1;i<=n/2-1;i++){
                System.out.print(i*2 - 1 + " ");
                o=o+i*2 - 1;
            }
            System.out.println(e-o);
        }
    }
}