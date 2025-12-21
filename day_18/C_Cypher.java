package day_18;
import java.util.Scanner;

public class C_Cypher {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        t=in.nextInt();
        while(t-- > 0){
            int n=in.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                int b=in.nextInt();
                String str=in.next();
                for(int k=0;k<b;k++){
                if(str.charAt(k)=='U'){
                    if(a[i]==0)
                        a[i]=9;
                    else
                    a[i]=a[i]-1;
                }
                else{
                    if(a[i]==9)
                        a[i]=0;
                    else 
                    a[i]=a[i]+1;
                }
            }
            }
            for(int i=0;i<n;i++){
                System.out.print(a[i]+" ");
            } 
            System.out.println();
        }
    }
}