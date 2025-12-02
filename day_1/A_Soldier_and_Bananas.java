public class A_Soldier_and_Bananas {
    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int w = in.nextInt();
        int totalCost = k * (w * (w + 1)) / 2;
        int amountToBorrow = totalCost - n;
        if (amountToBorrow < 0) {
            amountToBorrow = 0;
        }
        System.out.println(amountToBorrow);
    }
}