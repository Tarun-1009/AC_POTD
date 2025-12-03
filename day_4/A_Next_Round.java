package day_4;
import java.util.Scanner;
public class A_Next_Round {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int array[] = new int[n];
        int count =0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(array[i]>=array[k-1] && array[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}