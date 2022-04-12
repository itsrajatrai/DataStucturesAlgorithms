import java.util.Scanner;

public class GradingStudent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int[] result = new int[n];
        for (int j = 0; j < n; j++) {
            if (arr[j] >= 38) {
                if (arr[j] % 5 >= 3) {
                    result[j] = arr[j] + (5 - (arr[j] % 5));
                } else {
                    result[j] = arr[j];
                }
            } else {
                result[j] = arr[j];
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.println(result[k]);
        }
    }
}
