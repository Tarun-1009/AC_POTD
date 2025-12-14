package day_11;
import java.util.Scanner;
class B_Even_Array{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t,n,evenCount,oddCount;
        t=in.nextInt();
        while(t-->0){
            n=in.nextInt();
            evenCount=0;
            oddCount=0;
            for(int i=0;i<n;i++){
                int a=in.nextInt();
                if(i%2==0 && a%2==1){
                    oddCount++;
                }
                else if(i%2==1 && a%2==0){
                    evenCount++;
                }
            }
            if(evenCount==oddCount){
                System.out.println(evenCount);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}