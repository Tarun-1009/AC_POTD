package day_8;
import java.util.Scanner;
public class B_Long_Long {
    public static void main(String[] args) {
        int t,n,count;
        long a,max;
        int negativeSegement;
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        while(t-->0){
            n=in.nextInt();
            negativeSegement=0;
            count=0;
            max=0;
            for(int i=0;i<n;i++){
                a=in.nextLong();
                max=max+Math.abs(a);
                if(a<0){
                    if(negativeSegement==0){
                        negativeSegement=1;
                        count++;
                    }
                }
                else if(a>0){
                    negativeSegement=0;
                }
            }
            System.out.println(max+" "+count);
        }
    }
}