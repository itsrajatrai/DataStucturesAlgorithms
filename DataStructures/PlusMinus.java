import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int poss = 0, neg = 0, zero = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                poss++;
            } else if (a[i] < 0) {
                neg++;

            } else {
                zero++;

            }
        }

        System.out.println((double) poss / n);
        System.out.println((double) neg / n);
        System.out.println((double) zero / n);
}
