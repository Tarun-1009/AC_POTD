import java.util.Scanner;
public class A_Twin_Permutations {
    public static void main(String[] argd){
        int t;
        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            for(int i = 1; i <= n; i++){
                int num=in.nextInt();
                System.out.print(n+1-num + " ");
            }
            System.out.println();
        }
    }
}