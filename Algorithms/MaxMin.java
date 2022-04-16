import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);

        // Inserting values in array
        for (int m = 0; m < n; m++) {
            arr[m] = sc.nextInt();
        }

        // Sorting the array
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        long maxsum = 0L;
        long minsum = 0L;

        // Finding the max sum
        for (int x = 1; x < n; x++) {
            maxsum = maxsum + arr[x];
        }

        // Finding the min sum
        for (int y = 0; y < n - 1; y++) {
            minsum = minsum + arr[y];
        }

        System.out.println(minsum + " " + maxsum);

    }
}
