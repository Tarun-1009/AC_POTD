import java.util.Scanner;
public class A_Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int t = 0; t < T; t++) {
            int n = in.nextInt();
            if(n%2==0)
            System.out.println(n /4+1);
            else
            System.out.println(0);
        }
    }
}