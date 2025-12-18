package day_15;
public class A_Chewbacca_and_Number{
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        long n,res=0;
        n = in.nextLong();
        long i=1;
        while(n>0){
            long d=n%10;
            if(n/10==0 && d==9){
                res=d*i+res;
                break;
            }
            if(d>4){
                d=9-d;
            }
            res=d*i+res;
            i*=10;
            n=n/10;
        }
        System.out.println(res);
    }
}