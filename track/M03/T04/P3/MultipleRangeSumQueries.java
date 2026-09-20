
import java.util.Scanner;

public class MultipleRangeSumQueries {

    public static int sum(int a[], int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int queries = sc.nextInt();
        for (int i = 1; i <= queries; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            System.out.println(sum(arr, start, end));
        }
    }
}
