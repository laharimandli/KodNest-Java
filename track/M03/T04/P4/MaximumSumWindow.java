
import java.util.Scanner;

public class MaximumSumWindow {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int size = sc.nextInt();
        long maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= n - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum += arr[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
