
import java.util.Scanner;

public class SufixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sufix[] = new long[n];
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += arr[i];
            sufix[n - 1 - i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sufix[i] + " ");
        }
    }
}
