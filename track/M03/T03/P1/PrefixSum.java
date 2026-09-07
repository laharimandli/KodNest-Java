
import java.util.Scanner;

public class PrefixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long prefix[] = new long[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
