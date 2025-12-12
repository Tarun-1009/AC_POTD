package day_9;
import java.util.*;

public class Solution {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long ans = 0;
            for (int i = 1; i <= n; i++) {
                int p = sc.nextInt();
                long diff = Math.abs(p - i);
                if (diff != 0) {
                    if (ans == 0) {
                        ans = diff;
                    } else {
                        ans = gcd(ans, diff);
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
